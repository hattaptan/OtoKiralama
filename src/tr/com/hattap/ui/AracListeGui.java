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

import tr.com.hattap.db.AracKayitDb;



public class AracListeGui extends JFrame implements pencereýfc{

		public AracListeGui() {
			// TODO Auto-generated constructor stub
			initJFrame();
		}

		@Override
		public void initJFrame() {
			// TODO Auto-generated method stub
			JPanel anaJPanel = initJPanel();
			add(anaJPanel);
			setTitle("Arac Listele");
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			pack();
			
		}

		@Override
		public JPanel initJPanel() {
			// TODO Auto-generated method stub
			JPanel anaJPanel = new JPanel(new BorderLayout());
			JPanel ustJPanel = new JPanel(new GridLayout(1,3,5,5));
			JPanel altJPanel = new JPanel(new GridLayout(1,1,5,5));
			JPanel ortaJPanel = new JPanel(new GridLayout(1,1));
			
			ustJPanel.setBorder(BorderFactory.createTitledBorder("ARAC LISTE"));
			
			JLabel plakanoJLabel = new JLabel("Plaka ");
			ustJPanel.add(plakanoJLabel);
			
			ImageIcon icon3 = new ImageIcon("img/ara.png");
			ImageIcon icon4 = new ImageIcon("img/exit.png");
			
			
			final JTextField tcnoField = new JTextField();
			ustJPanel.add(tcnoField);
			
			JButton araButton = new JButton("Ara");
			araButton.setIcon(icon3);
			ustJPanel.add(araButton);
			
			
			
			JButton cikisButton = new JButton("Çýkýþ");
			cikisButton.setIcon(icon4);
			altJPanel.add(cikisButton);
			
			
			
			
			
			
			
			final JList araclisteleJList = new JList(AracKayitDb.listele().toArray());
			JScrollPane araclisteleJScrollPane = new JScrollPane(araclisteleJList);
			araclisteleJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			ortaJPanel.add(araclisteleJScrollPane);
			
			araclisteleJList.addAncestorListener(new AncestorListener() {
				
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

					araclisteleJList.setListData(AracKayitDb.listele().toArray());
					
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
						araclisteleJList.setListData(AracKayitDb.listele().toArray());
					} else {
						araclisteleJList.setListData(AracKayitDb.bul(aranan).toArray());
					}
					
				}
				
				@Override
				public void keyPressed(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
			
			cikisButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
	 
					dispose();

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
