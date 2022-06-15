package tr.com.hattap.ui;





import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
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
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import tr.com.hattap.db.AracKayitDb;
import tr.com.hattap.domain.AracKayitDomain;










public  class AracEkleGui extends JFrame implements pencereýfc{

	public AracEkleGui() {
		// TODO Auto-generated constructor stub
		initJFrame();
	}

	@Override
	public void initJFrame() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = initJPanel();
		add(anaJPanel);
		setTitle("Araç Ekle");
		setVisible(true);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(750, 400);
		
	}

	@Override
	public JPanel initJPanel() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = new JPanel(new BorderLayout());
		JPanel bolJPanel = new JPanel(new GridLayout(1,2));
		JPanel solJPanel = new JPanel(new GridLayout(11,2,5,5));
		JPanel sagJPanel = new JPanel(new GridLayout(1,1));
		JPanel altJPanel = new JPanel(new GridLayout(1,5,5,5));
		
	/*	solJPanel.setBackground(Color.red);
		sagJPanel.setBackground(Color.red);
		altJPanel.setBackground(Color.red);
		bolJPanel.setBackground(Color.red);   */
		
		
		
		
		solJPanel.setBorder(BorderFactory.createTitledBorder("ARAC EKLE"));
		sagJPanel.setBorder(BorderFactory.createTitledBorder("ARAC LISTE"));
		
		JLabel plakaJLabel = new JLabel("Plaka");
		solJPanel.add(plakaJLabel);
		
		final JTextField plakaField = new JTextField();
		solJPanel.add(plakaField);
		
		JLabel markaJLabel = new JLabel("Marka");
		solJPanel.add(markaJLabel);
		
		final JComboBox markaBox = new JComboBox();
		solJPanel.add(markaBox);
		
		
		markaBox.addItem("BMW");
		markaBox.addItem("Renault");
		markaBox.addItem("Opel");
		markaBox.addItem("Ford");
		markaBox.addItem("Fiat");
		markaBox.addItem("VolksWagen");
		
		
		
		 JLabel renkJLabel = new JLabel("Renk");
		solJPanel.add(renkJLabel);
		
		final JTextField renkField = new JTextField();
		solJPanel.add(renkField);
		
		JLabel modelJLabel = new JLabel("Model");
		solJPanel.add(modelJLabel);
		
		final JTextField modelField = new JTextField();
		solJPanel.add(modelField);
		
		JLabel vitesJLabel = new JLabel("Vites");
		solJPanel.add(vitesJLabel);
		
		final JComboBox vitesBox = new JComboBox();
		solJPanel.add(vitesBox);
		
		vitesBox.addItem("Manuel");
		vitesBox.addItem("Otomatik");
		vitesBox.addItem("Triptonik");
		
		
		JLabel yakitJLabel = new JLabel("Yakit");
		solJPanel.add(yakitJLabel);
		
		final JTextField yakitField = new JTextField();
		solJPanel.add(yakitField);
		
		JLabel tipiJLabel = new JLabel("Tip");
		solJPanel.add(tipiJLabel);
		
		final JTextField tipiField = new JTextField();
		solJPanel.add(tipiField);
		
		JLabel motorgucuJLabel = new JLabel("Motor Gücü");
		solJPanel.add(motorgucuJLabel);
		
		final JTextField motorgucuField = new JTextField();
		solJPanel.add(motorgucuField);
		
		JLabel gunlukJLabel = new JLabel("Günlük");
		solJPanel.add(gunlukJLabel);
		
		final JTextField gunlukField = new JTextField();
		solJPanel.add(gunlukField);
		
		JLabel haftalikJLabel = new JLabel("Haftalýk");
		solJPanel.add(haftalikJLabel);
		
		final JTextField haftalikField = new JTextField();
		solJPanel.add(haftalikField);
		
		JLabel aylikJLabel = new JLabel("Aylýk");
		solJPanel.add(aylikJLabel);
		
		final JTextField aylikField = new JTextField();
		solJPanel.add(aylikField);
		
		
		
		final JList aracgirisJList = new JList(AracKayitDb.listele().toArray());
		JScrollPane aracgirisJScrollPane = new JScrollPane(aracgirisJList);
		aracgirisJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sagJPanel.add(aracgirisJScrollPane);

		
		
		


		ImageIcon icon = new ImageIcon("img/icon.png");
		ImageIcon icon1 = new ImageIcon("img/exit.png");
		ImageIcon icon5 = new ImageIcon("img/del.png");
		ImageIcon icon7 = new ImageIcon("img/edit.gif");
		
		JButton kaydetButton = new JButton("Kaydet");
		kaydetButton.setIcon(icon);
		altJPanel.add(kaydetButton);
		
		JButton duzenleButton = new JButton("Düzenle");
		duzenleButton.setIcon(icon7);
		altJPanel.add(duzenleButton);
		
		JButton silButton = new JButton("Sil");
		silButton.setIcon(icon5);
		altJPanel.add(silButton);
		
		
		
		JButton cikisButton = new JButton("Çýkýþ");
		cikisButton.setIcon(icon1);
		altJPanel.add(cikisButton);
		

		kaydetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				AracKayitDomain bilgiDomain = new AracKayitDomain();
				
				bilgiDomain.setPlaka(plakaField.getText());
				bilgiDomain.setMarkaBox(markaBox.getSelectedItem().toString());
				bilgiDomain.setRenk(renkField.getText());
				bilgiDomain.setModel(modelField.getText());
				bilgiDomain.setVitesBox(vitesBox.getSelectedItem().toString());
				bilgiDomain.setYakit(yakitField.getText());
				bilgiDomain.setTip(tipiField.getText());
				bilgiDomain.setMotorGucu(motorgucuField.getText());
				bilgiDomain.setGunluk(gunlukField.getText());
				bilgiDomain.setHaftalik(haftalikField.getText());
				bilgiDomain.setAylik(aylikField.getText());
				
				AracKayitDb.ekle(bilgiDomain);
				
				aracgirisJList.setListData(AracKayitDb.listele().toArray());
				
				plakaField.setText("");
				modelField.setText("");
				renkField.setText("");
				yakitField.setText("");
				tipiField.setText("");
				modelField.setText("");
				gunlukField.setText("");
				haftalikField.setText("");
				aylikField.setText("");
				
				
			}
		});
		
		silButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				AracKayitDomain silAracBilgiDomain = (AracKayitDomain) aracgirisJList.getSelectedValue();
				
				
			if (silAracBilgiDomain != null){

					int cvp = JOptionPane.showConfirmDialog(null,
							"Kaydý Silmek Ýstediðinize Emin Misiniz?", "UYARI",
							JOptionPane.YES_NO_OPTION);

					if (cvp == 0) {

					    JOptionPane.showMessageDialog(null, "Kayýt Silme Baþarýlý.");
					    
					    AracKayitDb.sil(silAracBilgiDomain);
					    
					    aracgirisJList.setListData(AracKayitDb.listele().toArray());
					    
					}
					else{
						JOptionPane.showMessageDialog(null, "Kayýt Silme iþlemi iptal edildi");
						}
	        
	         }
					    
			}
		});
		
		
		duzenleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				AracKayitDomain duzenleAracBilgiDomain = (AracKayitDomain) aracgirisJList.getSelectedValue();
				
				duzenleAracBilgiDomain.setPlaka(plakaField.getText());
				duzenleAracBilgiDomain.setMarkaBox(markaBox.getSelectedItem().toString());
				duzenleAracBilgiDomain.setModel(modelField.getText());
				duzenleAracBilgiDomain.setRenk(renkField.getText());
				duzenleAracBilgiDomain.setVitesBox(vitesBox.getSelectedItem().toString());
				duzenleAracBilgiDomain.setYakit(yakitField.getText());
				duzenleAracBilgiDomain.setTip(tipiField.getText());
				duzenleAracBilgiDomain.setMotorGucu(motorgucuField.getText());
				duzenleAracBilgiDomain.setGunluk(gunlukField.getText());
				duzenleAracBilgiDomain.setHaftalik(haftalikField.getText());
				duzenleAracBilgiDomain.setAylik(aylikField.getText());
				
				AracKayitDb.duzenle(duzenleAracBilgiDomain);
				
				aracgirisJList.setListData(AracKayitDb.listele().toArray());
				
				plakaField.setText("");
				modelField.setText("");
				renkField.setText("");
				yakitField.setText("");
				tipiField.setText("");
				motorgucuField.setText("");
				gunlukField.setText("");
				haftalikField.setText("");
				aylikField.setText("");
				
				
				
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
