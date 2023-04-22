import java.applet.*;
import java.awt.*;

public class color extends Applet{
Choice k=new Choice();
public void init()
{
k.addItem("Blue");
k.addItem("Green");
k.addItem("Yellow");
add(k);
}
public void paint(Graphics g)
{
String a=k.getSelectedItem();

 if(a=="Yellow")
setBackground(Color.blue);

else if(a=="Green")
setBackground(Color.green);


else if(a=="Blue")
setBackground(Color.yellow);


}
}