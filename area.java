import java.text.SimpleDateFormat;
import java.util.*;
public class area {
    public static void main(String args[])
    {
    System.out.println("Name: Tirth Bhayani");
    System.out.println("220170116004");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
    System.out.println();
    int tirth  = 0;
    Scanner sc = new Scanner(System.in);
    do{
    System.out.println("1.squre  2.rectangle  3.triangle");
    System.out.println("enter chioce:");
    int c = sc.nextInt();
    switch (c) {
        case 1: 
            System.out.println("enter length of squre:");
            double x = sc.nextDouble();
            System.out.println("area of squre = "+area(x));    
            break;
    
        case 2:
            System.out.println("enter a:");
            double a = sc.nextDouble();
            System.out.println("enter b:");
            double b = sc.nextDouble();
            System.out.println("area of rectangle = "+area(a,b));
            break;

        case 3:
            System.out.println("enter a:");
            double p = sc.nextDouble();
            System.out.println("enter b:");
            double q = sc.nextDouble();
            System.out.println("enter c:");
            double r = sc.nextDouble();
            System.out.println("area of triangle = "+area(p,q,r));
            break;

        default:
            tirth =1;
            break;
    }
    }while(tirth!=1);
    }
        public static double area(double x)
        {
            return x*x;
        }
        public static double area(double a,double b)
        {
            return a*b;
        }
        public static double area(double a,double b,double c)
        {
            double s  = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return area;
        }
}

