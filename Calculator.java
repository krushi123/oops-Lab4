import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends Applet implements ActionListener{
    Button b1,b2,b3,b4,b5;
    TextField tf1,tf2,tf3;
    Label lb1,lb2,lb3;
    public void init()
    {
        lb1=new Label("Enter 1st number");
        lb1.setBounds(100,40,100,20);
        tf1=new TextField();
        tf1.setBounds(210,40,100,20);
        lb2=new Label("Enter 2nd number");
        lb2.setBounds(100,80,100,20);
        tf2=new TextField();
        tf2.setBounds(210,80,100,20);
        lb3=new Label("Result");
        lb3.setBounds(100,120,100,20);
        tf3=new TextField();
        tf3.setBounds(210,120,100,20);
        b1=new Button("+");
        b1.setBounds(80,150,60,50);
        b2=new Button("-");
        b2.setBounds(130,150,60,50);
        b3=new Button("*");
        b3.setBounds(180,150,60,50);
        b4=new Button("/");
        b4.setBounds(230,150,60,50);
        b5=new Button("%");
        b5.setBounds(280,150,60,50);
        add(lb1);add(lb2);add(lb3);add(tf1);add(tf2);add(tf3);add(b1);add(b2);add(b3);add(b4);add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(tf1.getText());
        int b=Integer.parseInt(tf2.getText());
        if(e.getSource()==b1)
        {
            tf3.setText(String.valueOf(a+b));
        }
        if(e.getSource()==b2)
        {
            tf3.setText(String.valueOf(a-b));
        }
        if(e.getSource()==b3)
        {
            tf3.setText(String.valueOf(a*b));
        }
        if(e.getSource()==b4)
        {
            tf3.setText(String.valueOf(a/b));
        }
        if(e.getSource()==b5)
        {
            tf3.setText(String.valueOf(a%b));
        }
    }

}