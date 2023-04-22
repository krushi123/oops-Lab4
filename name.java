import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;
public class name extends Applet{
    public void paint(Graphics g)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String k=sc.nextLine();
    
        g.drawString("Hello "+k, 50, 50);
    
    

    }
}