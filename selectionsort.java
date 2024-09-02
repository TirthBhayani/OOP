import java.text.SimpleDateFormat;
import java.util.*;

public class selectionsort {
    public static void main(String args[]) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        long startTime = System.currentTimeMillis();
        int a[] = new int[10];
        
        cratearr(a);
        sort(a);
        print(a);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");

    }
    public static int[] cratearr(int a[])
     {
        System.out.println("enter array:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        return a;
     }

    public static void sort(int a[]) 
    {
        int i, j, min_idx;

        for (i = 0; i < 9; i++) {
            min_idx = i;
            for (j = i + 1; j < 10; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;

            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;

        }
    }

    public static void print(int a[]) 
    {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}