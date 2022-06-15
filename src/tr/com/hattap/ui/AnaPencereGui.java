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

public class AnaPencereGui extends JFrame implements pencere�fc{

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
		ImageIcon icon12 = new ImageIcon("img/m�steri.png");
		ImageIcon icon13 = new ImageIcon("img/list.png");
		ImageIcon icon14 = new ImageIcon("img/res.png");
		ImageIcon icon15 = new ImageIcon("img/exx.png");
		ImageIcon icon16 = new ImageIcon("img/okey.png");
		
		ImageIcon aplan = new ImageIcon("img/asa.png");
		 JLabel anaJLabel = new JLabel(aplan);
		 
		 ortaJPanel.add(anaJLabel);
		
		JButton m�steriekleButton = new JButton("M��teri Ekle");
		m�steriekleButton.setIcon(icon12);
		solJPanel.add(m�steriekleButton);
	
		JButton aracgirisiButton = new JButton("Ara� Ekle          ");
		aracgirisiButton.setIcon(icon9);
		solJPanel.add(aracgirisiButton);
		
		JButton m�sterilisteleButton = new JButton("M��teri Listele");
		m�sterilisteleButton.setIcon(icon13);
		solJPanel.add(m�sterilisteleButton);
		
		JButton araclisteButton = new JButton("Ara�  Listele      ");
		araclisteButton.setIcon(icon14);
		solJPanel.add(araclisteButton);
		
		JButton arackiraButton = new JButton("Arac Kirala    ");
		arackiraButton.setIcon(icon11);
		solJPanel.add(arackiraButton);
		
		JButton sozlesmeJButton = new JButton("S�zle�me    ");
		sozlesmeJButton.setIcon(icon16);
		solJPanel.add(sozlesmeJButton);
		
		JButton cikisButton = new JButton("��k��     ");
		cikisButton.setIcon(icon15);
		solJPanel.add(cikisButton);
	
		
		m�steriekleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new M�steriEkleGui();
			}
		});
		
		aracgirisiButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new AracEkleGui();
			}
		});
		
		m�sterilisteleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new M�steriListeGui();
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
