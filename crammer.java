import java.util.*;
public class crammer {
    public static void main(String args[])
    {
        double a,b,c,d,e,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        a = sc.nextDouble();
        System.out.println("enter b");
        b = sc.nextDouble();
        System.out.println("enter c");
        c = sc.nextDouble();
        System.out.println("enter d");
        d = sc.nextDouble();
        System.out.println("enter e");
        e = sc.nextDouble();
        System.out.println("enter f");
        f = sc.nextDouble();

        double x=  ((e*d)-(b*f))/((a*d)-(b*c));
        double y=  ((a*f)-(e*c))/((a*d)-(b*c));
		System.out.println("x is" +x+ " y is" + y);
    }
}
