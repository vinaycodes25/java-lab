import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class palindrome extends Applet implements KeyListener{
int width;
	TextField tf=new TextField(width=5);
	String msg="";
	public void init() {
		add(new Label("enter string"));
		add(tf);
		tf.addKeyListener(this);
		
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
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		String inp=tf.getText();
		if(e.getKeyChar()=='p')
		{
		if(palin(inp))
		{
			showStatus("palindrome");
			msg="it is a palindrome";
		}
		else
		{
			showStatus("not palindrome");
			msg="not";
		}
	}
		repaint();}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("released");
		
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 50, 50);
	}
	
	

}
