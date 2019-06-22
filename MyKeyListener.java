import java.awt.*;
import java.awt.event.*;
public class MyKeyListener extends Frame implements KeyListener
{
	Canvas c;
	Label l,l1;
	
	TextArea a;

	

	 MyKeyListener()
	 {
	
		l=new Label();
		l.setBounds(20,50,300,20);
		l1=new Label();
		l1.setBounds(20,80,150,20);		
		c=new Canvas();
		c.setSize(400,400);
		a=new TextArea();
		a.setBounds(20,110,350,270);
		a.addKeyListener(this);
		add(l);
		add(a);
		add(l1);add(c);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	    public void keyPressed(KeyEvent e)
	     {
	     	c.setBackground(Color.GRAY);
	     	l1.setText("KEY IS PRESSED");
	     	
	     }  
    	public void keyReleased(KeyEvent e) 
    	{  
        	String text=a.getText();  
        	String words[]=text.split("\\s");  
        	l.setText("Words: "+words.length+" Characters:"+text.length());  
        	c.setBackground(Color.GREEN);
	     	l1.setText("KEY IS RELEASED");
	     	
    	}  
    	public void keyTyped(KeyEvent e) 
    	{
    		c.setBackground(Color.RED);
	     	l1.setText("KEY IS TYPED");
	     	


    	}  
    
    	
  
    	public static void main(String s[]) 
    	{  
        	new MyKeyListener();  
    	}  
    }

 