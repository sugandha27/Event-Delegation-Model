import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;  
import java.applet.Applet;
import java.awt.Panel;
import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.Label;
import java.awt.CheckboxGroup;
public class cal_checkbox extends Applet implements ItemListener
{
    Checkbox c1,c2,c3,c4;
    TextField t1,t2,t3,t4;
    Label l;
    public void init()
    {
    t1=new TextField(10);
    t2=new TextField(4);
    t3=new TextField(10);
    l=new Label("=");
    t4=new TextField(10);

    CheckboxGroup g1=new CheckboxGroup();
    c1=new Checkbox("Add",g1,false);
    c2=new Checkbox("Subtract",g1,false);
    
    c3=new Checkbox("Divide",g1,false);
    
    c4=new Checkbox("Multiply",g1,false);
    
    Panel p1=new Panel();
    Panel p2=new Panel();
   
    p1.add(c1);
    p1.add(c2);
    p1.add(c3);
    p1.add(c4);
    p2.add(t1);
    p2.add(t2);
    p2.add(t3);
    p2.add(l);
    p2.add(t4);
    

    add(p1);
    add(p2);
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
    c4.addItemListener(this);
    } 
    public void itemStateChanged(ItemEvent e)
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