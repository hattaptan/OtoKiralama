package tr.com.hattap.ui;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class AnaPencereGui extends JFrame implements pencereýfc{

	public AnaPencereGui() {
		// TODO Auto-generated constructor stub
		initJFrame();
	}

	@Override
	public void initJFrame() {
		// TODO Auto-generated method stub
		
		
		
		
		JPanel anaJPanel = initJPanel();
		add(anaJPanel);
		setTitle("Oto Kiralama");
		setSize(760,470);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}

	@Override
	public JPanel initJPanel() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = new JPanel(new BorderLayout());
		JPanel ortaJPanel = new  JPanel(new GridLayout(1,5,5,5));
		JPanel ustJPanel = new JPanel(new GridLayout(10,5,5,5));
		JPanel altJPanel = new JPanel(new GridLayout(10,5,5,5));
		JPanel solJPanel = new JPanel(new GridLayout(7,5,5,5));
		
		
	//	solJPanel.setBackground(Color.black);
		
		solJPanel.setBorder(BorderFactory.createTitledBorder("           RENT A CAR"));
		
		ImageIcon icon9 = new ImageIcon("img/car.png");
		ImageIcon icon11 = new ImageIcon("img/kirala.png");
		ImageIcon icon12 = new ImageIcon("img/müsteri.png");
		ImageIcon icon13 = new ImageIcon("img/list.png");
		ImageIcon icon14 = new ImageIcon("img/res.png");
		ImageIcon icon15 = new ImageIcon("img/exx.png");
		ImageIcon icon16 = new ImageIcon("img/okey.png");
		
		ImageIcon aplan = new ImageIcon("img/asa.png");
		 JLabel anaJLabel = new JLabel(aplan);
		 
		 ortaJPanel.add(anaJLabel);
		
		JButton müsteriekleButton = new JButton("Müþteri Ekle");
		müsteriekleButton.setIcon(icon12);
		solJPanel.add(müsteriekleButton);
	
		JButton aracgirisiButton = new JButton("Araç Ekle          ");
		aracgirisiButton.setIcon(icon9);
		solJPanel.add(aracgirisiButton);
		
		JButton müsterilisteleButton = new JButton("Müþteri Listele");
		müsterilisteleButton.setIcon(icon13);
		solJPanel.add(müsterilisteleButton);
		
		JButton araclisteButton = new JButton("Araç  Listele      ");
		araclisteButton.setIcon(icon14);
		solJPanel.add(araclisteButton);
		
		JButton arackiraButton = new JButton("Arac Kirala    ");
		arackiraButton.setIcon(icon11);
		solJPanel.add(arackiraButton);
		
		JButton sozlesmeJButton = new JButton("Sözleþme    ");
		sozlesmeJButton.setIcon(icon16);
		solJPanel.add(sozlesmeJButton);
		
		JButton cikisButton = new JButton("Çýkýþ     ");
		cikisButton.setIcon(icon15);
		solJPanel.add(cikisButton);
	
		
		müsteriekleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new MüsteriEkleGui();
			}
		});
		
		aracgirisiButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new AracEkleGui();
			}
		});
		
		müsterilisteleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new MüsteriListeGui();
			}
		});
		
		araclisteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new AracListeGui();
			}
		});
		
		 sozlesmeJButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					new SozlesmeGui();
				}
			});
		
      arackiraButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				new KiralaGui();
			}
		});
		
		
		cikisButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
 
			System.exit(0);	

			}
		});
		
		anaJPanel.add(solJPanel,BorderLayout.WEST);
		anaJPanel.add(ortaJPanel,BorderLayout.EAST);
		return anaJPanel;
	}
	

	@Override
	public JMenuBar initJMenuBar() {
		// TODO Auto-generated method stub
		return null;
	}

}
