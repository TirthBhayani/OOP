import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class binaary {
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
       System.out.println("220170116004");
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       Date date = new Date();
       System.out.println(formatter.format(date));
       System.out.println(); 

       List<Integer> num = new ArrayList<>();
       num.add(1);
       num.add(2);
       num.add(3);
       num.add(4);
       num.add(5);

       int key = 5;
       int result = binarysearch(num,key);

   if(result != -1)
   {
       System.out.println("index -> "+result);
   }
   else{
       System.out.println(" Element not Found");
   }
   }
    public static <E extends Comparable<E>> int binarysearch(List<E> list ,E key)
    {
        int lb =0;
        int ub = list.size() -1;

        while(lb<=ub)
        {
            int mid = (lb+ub)/2;
            E midele = list.get(mid);

            int com = midele.compareTo(key);
            if(com == 0)
            {
                return mid;
            }
            else if(com<0)
            {
                lb = mid + 1;
            }
            else
            {
                ub = mid - 1;
            }
        }
        return -1;
    }
   
}
