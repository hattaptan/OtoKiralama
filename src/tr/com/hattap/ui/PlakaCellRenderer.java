package tr.com.hattap.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import tr.com.hattap.domain.AracKayitDomain;




public class PlakaCellRenderer extends JLabel implements ListCellRenderer {
	private static final Color HIGHLIGHT_COLOR  = new Color (0,0,128);
	  

	public PlakaCellRenderer() {
		
		setOpaque(true);
		setIconTextGap(12);
		
	}


public Component getListCellRendererComponent (JList list, Object value,int index, boolean isSelected, boolean cellHasFocus){
	
	AracKayitDomain entry = (AracKayitDomain) value;
	setText(entry.getPlaka());
	
	if (isSelected){
		setBackground(HIGHLIGHT_COLOR);
		setForeground(Color.white);
		
	}
	else{
		setBackground(Color.white);
		setForeground(Color.black);
	}

return this;
}
}
