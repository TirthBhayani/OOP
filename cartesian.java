import java.text.SimpleDateFormat;
import java.util.*;
public class cartesian
{
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();   
        cartesianpoint p1 = new cartesianpoint(1,2);
        p1.display();

        p1.move(3,4);
        p1.display();

        p1.move(5);
        p1.display();

        cartesianpoint p2 = new cartesianpoint(7);
        p2.display();
    } 
}

 class cartesianpoint{
    int x;
    int y;

    public cartesianpoint(int x,int y)
    {
        this.x =x;
        this.y =y;
    }
    public cartesianpoint(int xy) {
        this(xy, xy);
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public void move(int x1,int y1)
    {
        this.x = x1;
        this.y = y1;
    }
    public void move(int value)
    {
        this.x = value;
        this.y = value;
    }
    public void display()
    {
        System.out.println(" current x : " + x + "and y" + y);
    }
}
