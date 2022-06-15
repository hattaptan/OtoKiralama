package tr.com.hattap.test;


import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import tr.com.hattap.db.AracKayitDb;
import tr.com.hattap.db.ConnectionToDb;
import tr.com.hattap.db.KiralaDb;
import tr.com.hattap.db.MusteriKayitDb;
import tr.com.hattap.ui.AnaPencereGui;


public class Test {

	
	public static void main(String[] args) {
		
		
	   
		
		
		try {
			UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[1].getClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		new ConnectionToDb();
		
		KiralaDb.initTable();
		AracKayitDb.initTable();
		MusteriKayitDb.initTable();
		
		
		SwingUtilities .invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
			
				new AnaPencereGui();
		}
	
		});   

	

}
}

