package tr.com.hattap.ui;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import tr.com.hattap.db.MusteriKayitDb;

public class MüsteriListeGui extends JFrame implements pencereýfc{

	public MüsteriListeGui() {
		// TODO Auto-generated constructor stub
		initJFrame();
	}

	public void initJFrame() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = initJPanel();
		add(anaJPanel);
		setTitle("Müþteri Listele");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		pack();
		
	}

	public JPanel initJPanel() {
		// TODO Auto-generated method stub
		JPanel anaJPanel = new JPanel(new BorderLayout());
		JPanel ustJPanel = new JPanel(new GridLayout(1,3,5,5));
		JPanel altJPanel = new JPanel(new GridLayout(1,3,5,5));
		JPanel ortaJPanel = new JPanel(new GridLayout(1,1));
		
		ustJPanel.setBorder(BorderFactory.createTitledBorder("MUSTERI LISTELE"));
		
		JLabel tcnoJLabel = new JLabel("T.C. No");
		ustJPanel.add(tcnoJLabel);
		
		final JTextField tcnoField = new JTextField();
		ustJPanel.add(tcnoField);
		
		ImageIcon icon4 = new ImageIcon("img/ara.png");
		JButton araButton = new JButton("Ara");
		araButton.setIcon(icon4);
		ustJPanel.add(araButton);
		

		ImageIcon icon5 = new ImageIcon("img/exit.png");
		
		JButton cikisButton = new JButton("Çýkýþ");
		cikisButton.setIcon(icon5);
		altJPanel.add(cikisButton);
		
		cikisButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
 
				dispose();

			}
		});
		
		
		
		
		
		
		final JList müsterilisteleJList = new JList(MusteriKayitDb.listele().toArray());
		JScrollPane müsterilisteleJScrollPane = new JScrollPane(müsterilisteleJList);
		müsterilisteleJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		ortaJPanel.add(müsterilisteleJScrollPane);
		
		müsterilisteleJList.addAncestorListener(new AncestorListener() {
			
			@Override
			public void ancestorRemoved(AncestorEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void ancestorMoved(AncestorEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void ancestorAdded(AncestorEvent arg0) {

				müsterilisteleJList.setListData(MusteriKayitDb.listele().toArray());
			}
		});
		
			tcnoField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {

				String aranan = tcnoField.getText();
				if (aranan.isEmpty()) {
					müsterilisteleJList.setListData(MusteriKayitDb.listele().toArray());
				} else {
					müsterilisteleJList.setListData(MusteriKayitDb.bul(aranan).toArray());
				}
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		anaJPanel.add(ustJPanel,BorderLayout.NORTH);
		anaJPanel.add(ortaJPanel,BorderLayout.CENTER);
		anaJPanel.add(altJPanel,BorderLayout.SOUTH);
		return anaJPanel;
	}

	public JMenuBar initJMenuBar() {
		// TODO Auto-generated method stub
		return null;
	}

}

