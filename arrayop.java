import java.text.SimpleDateFormat;
import java.util.*;

public class arrayop {
    public static void main(String args[]) {

        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        int a[][];
        int b[][];
        int c[][] = new int[3][3];
        System.out.println("enter 1st matrix");
        a = creatematrix();
        System.out.println("enter 2nd matrix");
        b = creatematrix();
        int choice;
        int t = 0;
        do {
            System.out.println("1.addition 2.subtract 3.multiply");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add(a, b, c);
                    display(c);
                    break;

                case 2:
                    sub(a, b, c);
                    display(c);
                    break;

                case 3:
                    mul(a, b, c);
                    display(c);
                    break;

                default:
                    System.out.println("!!  Invaild choice  !!");
                    t = 1;
            }
        } while (t != 1);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");

    }

    public static int[][] creatematrix() {
        Scanner sc = new Scanner(System.in);
        int mtx[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mtx[i][j] = sc.nextInt();
            }
        }
        return mtx;
    }

    public static int[][] add(int a[][], int b[][], int c[][]) 
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static int[][] sub(int a[][], int b[][], int c[][]) 
    {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public static int[][] mul(int a[][], int b[][], int c[][]) 
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;

    }

    public static void display(int c[][]) 
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
