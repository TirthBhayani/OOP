import java.text.SimpleDateFormat;
import java.util.*;

public class findarea {
    public static void main(String args[]) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        System.out.println("enter triangle details : ");
        triangle t1 = new triangle();
        t1.getdata();
        t1.display();

        System.out.println("enter rectangle details : ");
        rectangle r1 = new rectangle();
        r1.getdata();
        r1.display();
    }
}

class shape {
    double a;
    double b;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        a = sc.nextDouble();

        System.out.println("enter b:");
        b = sc.nextDouble();
    }
}

class triangle extends shape {
    public void display() {
        double area = 0.5 * a * b;
        System.out.println("area of triangle : " + area);
    }
}

class rectangle extends shape {
    public void display() {
        double area = a * b;
        System.out.println("area of rectangle : " + area);
    }
}
