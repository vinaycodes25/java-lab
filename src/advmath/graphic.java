package advmath;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class graphic extends Applet implements MouseListener,MouseMotionListener{
	
	int x=0,y=0,height=0,width=0,startx=0,starty=0;
	public void init() {
		addMouseMotionListener(this);
		addMouseListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		x=startx;
		y=starty;
	height=e.getX()-x;
	width=e.getY()-y;
	if(height<0) {
		x=e.getX();
		y=e.getY();
		height=Math.abs(height);
	}
		
		
	if(width<0)
	{
		x=e.getX();
		y=e.getY();
		width=Math.abs(width);
		
	}

		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		startx=e.getX();
		starty=e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void paint(Graphics g)
	{
		g.drawRect(x,y,width,height);
		
	}


}
