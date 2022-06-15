package tr.com.hattap.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

	public class SozlesmeGui extends JFrame implements pencereýfc{

			public SozlesmeGui() {
				
				initJFrame();
			}

			@Override
			public void initJFrame() {
				
				JPanel anaJPanel = initJPanel();
				add(anaJPanel);
				setTitle("Sözleþme");
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
				JPanel altJPanel = new JPanel(new GridLayout(1,3,5,5));
				JPanel ortaJPanel = new JPanel(new GridLayout(1,1));
				anaJPanel.setBorder(BorderFactory.createTitledBorder("SOZLESME"));

				ImageIcon iconSozlesme = new ImageIcon("img/sozz.jpg");
				JLabel anaJLabel = new JLabel(iconSozlesme);
				
				ustJPanel.add(anaJLabel);
				
				ImageIcon icon1 = new ImageIcon("img/exit.png");
				
				
				JButton yazdirButton = new JButton("Yazdýr");
				
				JButton cikisButton = new JButton("Çýkýþ");
				cikisButton.setIcon(icon1);
				
				
				altJPanel.add(yazdirButton);
				altJPanel.add(cikisButton);
				
				yazdirButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						 PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
						    pras.add(new Copies(1));

						    PrintService pss[] = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.GIF, pras);

						    PrintService ps = pss[0];
						    System.out.println("Printing to " + ps);

						    DocPrintJob job = ps.createPrintJob();

						    FileInputStream fin = null;
							try {
								fin = new FileInputStream("img/sozz.jpg");
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						    Doc doc = new SimpleDoc(fin, DocFlavor.INPUT_STREAM.GIF, null);

						    try {
								job.print(doc, pras);
							} catch (PrintException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

						    try {
								fin.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
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
