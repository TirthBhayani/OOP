import java.text.SimpleDateFormat;
import java.util.*;
public class minelement {
    public static void main(String args[])
    {
            System.out.println("Name: Tirth Bhayani");
			System.out.println("220170116004");
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date();  
            System.out.println(formatter.format(date));
			long startTime = System.currentTimeMillis();
        

            int a[][];
            a = creatematrix();
            findmin(a);

            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Execution time: " + executionTime + " nanoseconds");
			
    }
    public static int[][] creatematrix()
    {
        Scanner sc = new Scanner(System.in);
        int mtx[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mtx[i][j] = sc.nextInt();
            }
        }
        return mtx;
    }
    public static void findmin(int a[][])
    {
        int min = a[0][0];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]<min)
                {
                    min = a[i][j];
                }
            }
        }
        System.out.println("minimum element = " + min);
    }
}
