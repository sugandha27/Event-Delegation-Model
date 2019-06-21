import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class eventHandlingMouseMotionListener extends Applet implements MouseListener,MouseMotionListener
{
	String s;
	int x,y;

	public void init()
	{
		addMouseListener(this);	
		addMouseMotionListener(this);				//register of event 'this' keyword refers to this class
	}
	public void mouseClicked(MouseEvent e)       //on instantanoeus mouse click background color changes to pink shade
	{
		setBackground(Color.YELLOW);
		x=e.getX();								//gets the x coordinate where the mouse is clicked
		y=e.getY();								//gets the y coordinate	where the mouse is clicked
		s="Mouse Clicked At"+x+","+y;
		repaint();								//to call paint function again
	}
	public void mousePressed(MouseEvent e)		//on mouse pressing for a while background color changing to light green shade
	{
		setBackground(new Color(134, 226, 213));
		x=e.getX();								//gets the x coordinate where the mouse is pressed
		y=e.getY();								//gets the y coordinate	where the mouse is pressed
		s="Mouse Pressed At"+x+","+y;
		repaint();

	}
	public void mouseReleased(MouseEvent e)		//on releasing mouse after click or press background color changes to purple shade 
	{

		setBackground(new Color(165, 55, 253));
		x=e.getX();								//gets the x coordinate where the mouse is released
		y=e.getY();								//gets the y coordinate	where the mouse is released
		s="Mouse Released At"+x+","+y;
		repaint();
	}
	public void mouseEntered(MouseEvent e)		//when mouse enters the applet background color changes to blue shade
	{
		setBackground(new Color(0, 181, 204));
		x=e.getX();								//gets the x coordinate where the mouse enters
		y=e.getY();								//gets the y coordinate	where the mouse enters
		s="Mouse Entered At"+x+","+y;
		repaint();
	}
	public void mouseExited(MouseEvent e)		//when mouse exits the applet screen background color changes to orange shade
	{
		setBackground(new Color(241, 90, 34));
		x=e.getX();								//gets the x coordinate where mouse exits
		y=e.getY();								//gets the y coordinate	where mouse exits
		s="Mouse Exited At"+x+","+y;
		repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		setBackground(new Color(241, 90, 219));
		x=e.getX();								//gets the x coordinate where mouse exits
		y=e.getY();								//gets the y coordinate	where mouse exits
		s="Mouse Moved At"+x+","+y;
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		setBackground(new Color(141, 90, 34));
		x=e.getX();								//gets the x coordinate where mouse exits
		y=e.getY();								//gets the y coordinate	where mouse exits
		s="Mouse Dragged At"+x+","+y;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(s,x,y);
	}

}