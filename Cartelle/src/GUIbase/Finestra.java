package GUIbase;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class Finestra extends Frame {
	JPanel c;

	public Finestra(String x) {
		super(x);
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
		
		setLayout(new BorderLayout());
		setLocation(Est.marginX, Est.marginY);
		setPreferredSize(Est.standard);
		setBackground(Est.sfondo);
		Header testa = new Header();
		add("South",testa);
		c = new JPanel();
		c.setLayout(new BorderLayout(100, 10));
		c.setBorder(Est.borCol);
		c.setOpaque(false);
		add("Center",c);

	}
}
