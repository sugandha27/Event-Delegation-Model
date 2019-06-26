import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;

public class cal_button extends Applet implements ActionListener
{
    Button c1,c2,c3,c4;
    TextField t1,t2,t3,t4;
    public void init()
    {
    t1=new TextField(10);
    t2=new TextField(4);
    t3=new TextField(10);
    t4=new TextField(10);
    c1=new Button("Add");
    c2=new Button("Subtract");
    
    c3=new Button("Divide");
    
    c4=new Button("Multiply");
    
    Panel p1=new Panel();
    Panel p2=new Panel();
    
    
    p1.add(c1);
    p1.add(c2);
    p1.add(c3);
    p1.add(c4);
    p2.add(t1);
    p2.add(t2);
    p2.add(t3);
    p2.add(t4);
    add(p1);
    add(p2);
    
    c1.addActionListener(this);

    c2.addActionListener(this);
    c3.addActionListener(this);
    c4.addActionListener(this);
    } 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==c1)
        
        {
            t2.setText("+");
            int s1=Integer.parseInt(t1.getText())+Integer.parseInt(t3.getText());
            t4.setText(String.valueOf(s1));
            
        }
        else if(e.getSource()==c2)
        {
            t2.setText("-");
            int s1=Integer.parseInt(t1.getText())-Integer.parseInt(t3.getText());
            t4.setText(String.valueOf(s1));
            
        }
        else if(e.getSource()==c3)
        {
            t2.setText("/");
            int s1=Integer.parseInt(t1.getText())/Integer.parseInt(t3.getText());
            t4.setText(String.valueOf(s1));
            
        }
        else if(e.getSource()==c4)
        {
            t2.setText("*");
            int s1=Integer.parseInt(t1.getText())*Integer.parseInt(t3.getText());
            t4.setText(String.valueOf(s1));
            
        }
    }
}