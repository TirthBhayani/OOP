import java.text.SimpleDateFormat;
import java.util.*;
public class shapemain
{
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();

        triangle t1 = new triangle(5,4);
        System.out.println("area of triangle : "+t1.area());

        rectangle r1 = new rectangle(5,4);
        System.out.println("area of rectangle : "+r1.area());
        
        circle c1 = new circle(4);
        System.out.println("area of circle : "+c1.area());
    }
}
abstract class shape {
    abstract double area();
}
class triangle extends shape{
    double a;
    double b;

    public triangle(double a,double b)
    {
        this.a = a;
        this.b = b;
    }
    public double area()
    {
           return 0.5*a*b; 
    }
}
class rectangle extends shape
{
    double x;
    double y;

    public rectangle(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public double area()
    {
        return x*y;
    }
}
    class circle extends shape{

        double r;
        public circle(double r)
        {
            this.r = r;
        }
        public double area()
        {
            return 3.14*r*r;
        }
    }

