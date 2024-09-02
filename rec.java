import java.text.SimpleDateFormat;
import java.util.*;
public class rec{
    public static void main(String args[])
    {
    System.out.println("Name: Tirth Bhayani");
    System.out.println("220170116004");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
    System.out.println();
    long startTime = System.currentTimeMillis();

    Scanner sc =new Scanner(System.in);
	System.out.println("enter 1st rectangle width");
	double wi= sc.nextDouble();
	System.out.println("enter 1st rectangle height");
	double hi = sc.nextDouble();
    Rectangle rec1 = new Rectangle(wi,hi);
	System.out.println("area of rectangle"+ rec1.getArea(wi,hi));
	System.out.println("perimeter of rectangle" +rec1.getpermeter(wi,hi));
    System.out.println();
    
    System.out.println("enter 2nd rectangle width");
	double wii= sc.nextDouble();
	System.out.println("enter 2nd rectangle height");
	double hii = sc.nextDouble();
    Rectangle rec2 = new Rectangle(wii,hii);
	System.out.println("area of rectangle"+ rec2.getArea(wi,hi));
	System.out.println("perimeter of rectangle" +rec2.getpermeter(wi,hi));

    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.println("Execution time: " + executionTime + "ms");
    }
}

class Rectangle{
   double width;
   double height;
   Rectangle()
   {
    double height = 1;
    double width =1;
   }
   Rectangle(double width,double height)
   {
        this.width = width;
        this.height= height;
   }

public double getArea(double width,double height)
{
  double area = width*height;
  return area;
}
public double getpermeter(double width,double height)
{
    double peri= 2*(width*height);
    return peri;
}
}