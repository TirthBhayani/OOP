import java.text.SimpleDateFormat;
import java.util.*;

public class Interface{
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();

        W w1 = new W();
         System.out.println(w1 instanceof I1);
         System.out.println(w1 instanceof I2);
         System.out.println(w1 instanceof I3);
         System.out.println(w1 instanceof I4);
        
         System.out.println(w1 instanceof X);

    }
}
interface I1{
}
interface I2{
}
interface I3 extends I1,I2
{
}
interface I4
{
}
class X implements I3{

}
class W extends X implements I4{

}
