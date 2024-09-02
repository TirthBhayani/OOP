import java.text.SimpleDateFormat;
import java.util.*;

public class volume {

    public static double volumee(double l) {
        return l * l * l;
    }

    public static double volumee(double l, double w, double h) {
        return l * w * h;
    }

    public static double volumee(int r) {
        return 4 / 3 * (3.14) * r * r * r;
    }

    public static void main(String args[]) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        int tirth = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.cube  2.rectangular cube  3.sphere");
            System.out.println("enter chioce:");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter length of cube:");
                    double x = sc.nextDouble();
                    System.out.println("volume of cube = " + volumee(x));
                    break;

                case 2:
                    System.out.println("enter lenght:");
                    double l = sc.nextDouble();
                    System.out.println("enter width:");
                    double w = sc.nextDouble();
                    System.out.println("enter height:");
                    double h = sc.nextDouble();
                    System.out.println("volume of rectangular = " + volumee(l, w, h));
                    break;

                case 3:
                    System.out.println("enter radius:");
                    int r = sc.nextInt();
                    System.out.println("volume of sphere = " + volumee(r));
                    break;

                default:
                    tirth = 1;
                    break;
            }
        } while (tirth != 1);
    }
}
