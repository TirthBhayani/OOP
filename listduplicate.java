import java.text.SimpleDateFormat;
import java.util.*;

public class listduplicate {
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
          num.add(i);
          num.add(i);
        }

    num = removeDuplicates(num);
    for(int n:num)
    {
        System.out.println(n);
    }
    }
    public static <E> ArrayList<E> removeDuplicates(List<E> list)
    {
        ArrayList<E> resultList = new ArrayList<>();
        for(E alist : list)
        {
            if(!resultList.contains(alist))
            {
                resultList.add(alist);
            }
        }
        return resultList;
    }
   
}
