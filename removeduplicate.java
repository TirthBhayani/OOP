import java.text.SimpleDateFormat;
import java.util.*;

public class removeduplicate {
    public static void main(String args[]) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        long startTime = System.currentTimeMillis();

        int a[];
        a = createarray();
        eleminate(a);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
        System.out.println(" ");

    }

    public static int[] createarray() {
        System.out.println("enter size of array :");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void eleminate(int a[]) {

        int x = 0;
        int len = a.length;
        int temp[] = new int[len];
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                temp[x] = a[i];
                x++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println(" ");
    }
}
