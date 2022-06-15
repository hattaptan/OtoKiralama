package tr.com.hattap.ui;



import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

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






import org.apache.derby.iapi.sql.dictionary.AliasDescriptor;

import tr.com.hattap.db.MusteriKayitDb;
import tr.com.hattap.domain.MusteriKayitDomain;

import com.toedter.calendar.JDateChooser;



public class MüsteriEkleGui extends JFrame implements pencereýfc{

	public MüsteriEkleGui() {
		// TODO Auto-generated constructor stub
		initJFrame();
	}

	@Override
	public void initJFrame() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = initJPanel();
		add(anaJPanel);
		setTitle("Müþteri Ekle");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		//pack();
		setSize(820, 500);
	}

	@Override
	public JPanel initJPanel() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = new JPanel(new BorderLayout());
		JPanel bolJPanel = new JPanel(new GridLayout(1,2));
		JPanel solJPanel = new JPanel(new GridLayout(12,2,5,5));
		JPanel sagJPanel = new JPanel(new BorderLayout());
		JPanel altJPanel = new JPanel(new GridLayout(1,4,5,5));
		
		solJPanel.setBorder(BorderFactory.createTitledBorder("MUSTERI EKLE"));
		sagJPanel.setBorder(BorderFactory.createTitledBorder("MUSTERI LISTE"));
		
		JLabel tcJLabel = new JLabel("Tc No");
		solJPanel.add(tcJLabel);
		
		final JTextField tcField = new JTextField();
		solJPanel.add(tcField);
		
		JLabel adiJLabel = new JLabel("Adý");
		solJPanel.add(adiJLabel);
		
		final JTextField adiField = new JTextField();
		solJPanel.add(adiField);
		
		JLabel soyadiJLabel = new JLabel("Soyadý");
		solJPanel.add(soyadiJLabel);
		
		final JTextField soyadiField = new JTextField();
		solJPanel.add(soyadiField);

		JLabel dtarihiJLabel = new JLabel("Doðum Tarihi");
		solJPanel.add(dtarihiJLabel);
		
		final JDateChooser dogumtarihiChooser = new JDateChooser();
		solJPanel.add(dogumtarihiChooser);
	
		JLabel telefonnoJLabel = new JLabel("Telefon Numarasý");
		solJPanel.add(telefonnoJLabel);
		
		final JTextField telefonnoField = new JTextField();
		solJPanel.add(telefonnoField);
		
		JLabel adresJLabel = new JLabel("Adresi ");
		solJPanel.add(adresJLabel);
		
		final JTextField adresfField = new JTextField();
		solJPanel.add(adresfField);
		
		JLabel EnoJLabel = new JLabel("Ehliyet No");
		solJPanel.add(EnoJLabel);
		
		final JTextField EnoField = new JTextField();
		solJPanel.add(EnoField);
		
		JLabel EtarihJLabel = new JLabel("Ehliyet Alýþ Tarih");
		solJPanel.add(EtarihJLabel);
		
		final JDateChooser etarihChooser = new JDateChooser();
		solJPanel.add(etarihChooser);
		
		JLabel ealisyerJLabel = new JLabel("Ehliyet Alýþ Yer");
		solJPanel.add(ealisyerJLabel);
		
		final JComboBox ealisyerBox = new JComboBox();
		solJPanel.add(ealisyerBox);
		
		ealisyerBox.addItem("Adana");
		ealisyerBox.addItem("Adýyaman");
		ealisyerBox.addItem("Afyon");
		ealisyerBox.addItem("Aðrý");
		ealisyerBox.addItem("Amasya");
		ealisyerBox.addItem("Ankara");
		ealisyerBox.addItem("Antalya");
		ealisyerBox.addItem("Artvin");
		ealisyerBox.addItem("Aydýn");
		ealisyerBox.addItem("Balýkesir");
		ealisyerBox.addItem("Bilecik");
		ealisyerBox.addItem("Bingöl");
		ealisyerBox.addItem("Bitlis");
		ealisyerBox.addItem("Bolu");
		ealisyerBox.addItem("Bolu");
		ealisyerBox.addItem("Burdur");
		ealisyerBox.addItem("Bursa");
		ealisyerBox.addItem("Çanakkale");
		ealisyerBox.addItem("Çankýrý");
		
		
		
		
		JLabel kadJLabel = new JLabel("Kefil Adý-Soyadý");
		solJPanel.add(kadJLabel);
		
		final JTextField kadField = new JTextField();
		solJPanel.add(kadField);
		
		
		JLabel ktelJLabel = new JLabel("Kefil Telefon No");
		solJPanel.add(ktelJLabel);
		
		final JTextField ktelField = new JTextField();
		solJPanel.add(ktelField);
		
		JLabel cinsiyetJLabel = new JLabel("Cinsiyet");
		solJPanel.add(cinsiyetJLabel);
		
		
		final JComboBox cinsiyetboxBox = new JComboBox();
		solJPanel.add(cinsiyetboxBox);
		
		cinsiyetboxBox.addItem("Erkek");
		cinsiyetboxBox.addItem("Kadýn");
        
      
		
		
		final JList müsteriekleJList = new JList(MusteriKayitDb.listele().toArray());
		JScrollPane müsteriekleJScrollPane = new JScrollPane(müsteriekleJList);
		müsteriekleJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sagJPanel.add(müsteriekleJScrollPane);
		
		
		ImageIcon icon = new ImageIcon("img/icon.png");
		ImageIcon icon1 = new ImageIcon("img/exit.png");
		ImageIcon icon6 = new ImageIcon("img/del.png");
		ImageIcon icon8 = new ImageIcon("img/edit.gif");
	
		
		JButton kaydetButton = new JButton("Kaydet");
		kaydetButton.setIcon(icon);
		altJPanel.add(kaydetButton);
		
		JButton duzenleButton = new JButton("Düzenle");
		duzenleButton.setIcon(icon8);
		altJPanel.add(duzenleButton);
		
		JButton silButton = new JButton("Sil");
		silButton.setIcon(icon6);
		altJPanel.add(silButton);
		
		
		
		JButton cikisButton = new JButton("Çýkýþ");
		cikisButton.setIcon(icon1);
		altJPanel.add(cikisButton);
		
		kaydetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				java.util.Date dogumtarihDate=dogumtarihiChooser.getDate();
				Date dogumtarihSQLDate = new Date(dogumtarihDate.getTime());
				
				java.util.Date etarihDate=etarihChooser.getDate();
				Date etarihSQLDate = new Date(etarihDate.getTime());
				
				
				
				MusteriKayitDomain MusteriKayitDomain = new MusteriKayitDomain();
				
				
				MusteriKayitDomain.setTcno(tcField.getText());
				MusteriKayitDomain.setAdi(adiField.getText());
				MusteriKayitDomain.setSoyadi(soyadiField.getText());
				MusteriKayitDomain.setDogumtarih(dogumtarihSQLDate);
				MusteriKayitDomain.setTelefon(telefonnoField.getText());
				MusteriKayitDomain.setAdres(adresfField.getText());
				MusteriKayitDomain.setEhliyetno(EnoField.getText());
				MusteriKayitDomain.setVerilenyer(ealisyerBox.getSelectedItem().toString());
				MusteriKayitDomain.setEtarih(etarihSQLDate);
				MusteriKayitDomain.setKefilbilgi(kadField.getText());
				MusteriKayitDomain.setKefiltelefon(ktelField.getText());
				MusteriKayitDomain.setCinsiyet(cinsiyetboxBox.getSelectedItem().toString());
				
				
				MusteriKayitDb.ekle(MusteriKayitDomain);
				
				müsteriekleJList.setListData(MusteriKayitDb.listele().toArray());
				
				tcField.setText("");
				adiField.setText("");
				soyadiField.setText("");
				telefonnoField.setText("");
				adresfField.setText("");
				EnoField.setText("");
				kadField.setText("");
				ktelField.setText("");	
				
				
			}
		});
		
		duzenleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				MusteriKayitDomain duzenleDomain = (MusteriKayitDomain) müsteriekleJList.getSelectedValue();
				
				java.util.Date dogumtarihDate=dogumtarihiChooser.getDate();
				Date dogumtarihSQLDate = new Date(dogumtarihDate.getTime());
				
				java.util.Date etarihDate=etarihChooser.getDate();
				Date etarihSQLDate = new Date(etarihDate.getTime());
				
			
				duzenleDomain.setTcno(tcField.getText());
				duzenleDomain.setAdi(adiField.getText());
				duzenleDomain.setSoyadi(soyadiField.getText());
				duzenleDomain.setDogumtarih(dogumtarihSQLDate);
				duzenleDomain.setTelefon(telefonnoField.getText());
				duzenleDomain.setAdres(adresfField.getText());
				duzenleDomain.setEhliyetno(EnoField.getText());
				duzenleDomain.setVerilenyer(ealisyerBox.getSelectedItem().toString());
				duzenleDomain.setEtarih(etarihSQLDate);
				duzenleDomain.setKefilbilgi(kadField.getText());
				duzenleDomain.setKefiltelefon(ktelField.getText());
				duzenleDomain.setCinsiyet(cinsiyetboxBox.getSelectedItem().toString());
				
				
				
				MusteriKayitDb.duzenle(duzenleDomain);
				
				tcField.setText("");
				adiField.setText("");
				soyadiField.setText("");
				telefonnoField.setText("");
				adresfField.setText("");
				EnoField.setText("");
				kadField.setText("");
				ktelField.setText("");
				
				
				müsteriekleJList.setListData(MusteriKayitDb.listele().toArray());
				
				
			}
		});
		
		silButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				
				MusteriKayitDomain silMusteriSatisDomain = (MusteriKayitDomain) müsteriekleJList.getSelectedValue();
				
				if (silMusteriSatisDomain != null){

					int cvp = JOptionPane.showConfirmDialog(null,
							"Kaydý Silmek Ýstediðinize Emin Misiniz?", "UYARI",
							JOptionPane.YES_NO_OPTION);

					if (cvp == 0) {

					    JOptionPane.showMessageDialog(null, "Kayýt Silme Baþarýlý.");
					    
					    MusteriKayitDb.sil(silMusteriSatisDomain);
					    
					    müsteriekleJList.setListData(MusteriKayitDb.listele().toArray());
					    
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
			}
		});
		
		anaJPanel.add(bolJPanel,BorderLayout.CENTER);
		bolJPanel.add(solJPanel,BorderLayout.EAST);
		bolJPanel.add(sagJPanel,BorderLayout.WEST);
		anaJPanel.add(altJPanel,BorderLayout.SOUTH);
		return anaJPanel;
	}

	@Override
	public JMenuBar initJMenuBar() {
		// TODO Auto-generated method stub
		return null;
	}

}
