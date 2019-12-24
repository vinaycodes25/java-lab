package foura;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Palindrome extends Applet implements KeyListener{
		
	private int width;
	TextField tf=new TextField(width=5);
	String msg="";
	public void init()
	{
		add(new Label("Enter the string"));
		add(tf);
		setFocusable(true);
		tf.addKeyListener(this);
addKeyListener(this);

		
	}
	public boolean palin(String s)
	{
		int i,j;
		for(i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public void keyPressed(KeyEvent e) {
		String inp=tf.getText();
		if(e.getKeyChar()=='p'){
		if(palin(inp)){
			showStatus("It is a palindrome");
			msg="palindrome";
			
		}
			else {
				showStatus("not pal");
				msg="not palin";
		}
		}
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		//showStatus("Released");
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}
