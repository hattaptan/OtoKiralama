package tr.com.hattap.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import tr.com.hattap.db.AracKayitDb;
import tr.com.hattap.db.KiralaDb;
import tr.com.hattap.db.MusteriKayitDb;
import tr.com.hattap.domain.AracKayitDomain;
import tr.com.hattap.domain.KiralaDomain;
import tr.com.hattap.domain.MusteriKayitDomain;

import com.toedter.calendar.JDateChooser;





public class KiralaGui extends JFrame implements pencereýfc{

	
	
	public KiralaGui() {
		// TODO Auto-generated constructor stub
		initJFrame();
	}

	@Override
	public void initJFrame() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = initJPanel();
		add(anaJPanel);
		setTitle("Araç Kirala");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		pack();
		
		
	}

	@Override
	public JPanel initJPanel() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = new JPanel(new BorderLayout());
		JPanel ustJPanel = new JPanel(new GridLayout(5,2,5,5));
		JPanel ortaJPanel = new JPanel(new GridLayout(1,2));
		JPanel altJPanel = new JPanel(new GridLayout(2,5,5,5));
		
		ustJPanel.setBorder(BorderFactory.createTitledBorder("ARAC KIRALA"));
		ortaJPanel.setBorder(BorderFactory.createTitledBorder("KIRALA LISTESI"));
		
		JLabel kisiJLabel = new JLabel("Kiralayan Kiþi");
		ustJPanel.add(kisiJLabel);
		
		final JComboBox kisiBox = new JComboBox(MusteriKayitDb.listele().toArray());
		kisiBox.setRenderer(new KiralaCellRenderer());
		ustJPanel.add(kisiBox);
		
		JLabel verilisTarihJLabel = new JLabel("Araç Veriliþ Tarihi");
		ustJPanel.add(verilisTarihJLabel);
		
		final JDateChooser verilisChooser = new JDateChooser();
		ustJPanel.add(verilisChooser);
		
		JLabel iadetarihJLabel = new JLabel("Araç Ýade Tarihi ");
		ustJPanel.add(iadetarihJLabel);
		
		final JDateChooser teslimChooser = new JDateChooser();
		ustJPanel.add(teslimChooser);

		JLabel plakaJLabel = new JLabel("Araç Plaka ");
		ustJPanel.add(plakaJLabel);
		
		final JComboBox plakaBox = new JComboBox(AracKayitDb.listele().toArray());
		plakaBox.setRenderer(new PlakaCellRenderer());
		ustJPanel.add(plakaBox);
		
		JLabel ucretJLabel = new JLabel("Toplam Ücret ");
		ustJPanel.add(ucretJLabel);
	
		final JTextField ucretField = new JTextField();
		ustJPanel.add(ucretField);
		

		
		
		final JList kiralalistJList = new JList(KiralaDb.listele().toArray());
		JScrollPane kiralalistJScrollPane = new JScrollPane(kiralalistJList);
		kiralalistJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		ortaJPanel.add(kiralalistJScrollPane);
		
		ImageIcon icon = new ImageIcon("img/icon.png");
		ImageIcon icon1 = new ImageIcon("img/exit.png");
		ImageIcon icon9 = new ImageIcon("img/edit.gif");
		ImageIcon icon10 = new ImageIcon("img/del.png");
		
		JButton kaydetButton = new JButton("Kirala");
		kaydetButton.setIcon(icon);
		altJPanel.add(kaydetButton);
		
		JButton duzenleButton = new JButton("Düzenle");
		duzenleButton.setIcon(icon9);
		altJPanel.add(duzenleButton);
		
		JButton silButton = new JButton("Sil");
		silButton.setIcon(icon10);
		altJPanel.add(silButton);
		
		
		JButton cikisButton = new JButton("Çýkýþ");
		cikisButton.setIcon(icon1);
		altJPanel.add(cikisButton);
		
		kaydetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				java.util.Date vtarihDate = verilisChooser.getDate();
				Date verilisSQLDate = new Date(vtarihDate.getTime());
				
				java.util.Date atarihDate = teslimChooser.getDate();
				Date alinisSQLDate = new Date(atarihDate.getTime());
				
				KiralaDomain kiralamaDomain = new KiralaDomain();
				
				MusteriKayitDomain secilecekKisiDomain = (MusteriKayitDomain) kisiBox.getSelectedItem();
				AracKayitDomain secilecekAracDomain = (AracKayitDomain) plakaBox.getSelectedItem();
				
				kiralamaDomain.setKkisi(secilecekKisiDomain.getId());
				kiralamaDomain.setVtarih(verilisSQLDate);
				kiralamaDomain.setAtarih(alinisSQLDate);
				kiralamaDomain.setAplaka(secilecekAracDomain.getId());
				kiralamaDomain.setFiyat(ucretField.getText());
				
				KiralaDb.ekle(kiralamaDomain);
				
				ucretField.setText("");
				
				kiralalistJList.setListData(KiralaDb.listele().toArray());
				
				
			}
		});
		
		silButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				KiralaDomain silkiralamaDomain = (KiralaDomain) kiralalistJList.getSelectedValue();
				
				if (silkiralamaDomain != null){

					int cvp = JOptionPane.showConfirmDialog(null,
							"Kaydý Silmek Ýstediðinize Emin Misiniz?", "UYARI",
							JOptionPane.YES_NO_OPTION);

					if (cvp == 0) {

					    JOptionPane.showMessageDialog(null, "Kayýt Silme Baþarýlý.");
					    
					    KiralaDb.sil(silkiralamaDomain);
					    
					    kiralalistJList.setListData(KiralaDb.listele().toArray());
					    
					}
					else{
						JOptionPane.showMessageDialog(null, "Kayýt Silme iþlemi iptal edildi");
						}
	        
	         }
				
			}
		});
		
		cikisButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				dispose();
				new AnaPencereGui();
			}
		});
		
		
		


		
		anaJPanel.add(ustJPanel,BorderLayout.NORTH);
		anaJPanel.add(ortaJPanel,BorderLayout.CENTER);
		anaJPanel.add(altJPanel,BorderLayout.SOUTH);
		
		

		
		
		
		
		
		return anaJPanel;
	}

	@Override
	public JMenuBar initJMenuBar() {
		// TODO Auto-generated method stub
		return null;
	}

}

