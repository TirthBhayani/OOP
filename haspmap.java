import java.text.SimpleDateFormat;
import java.util.*;
public class haspmap {
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        
        Map<String, String> capital = new HashMap<>();
        capital.put("India", "Delhi");
        capital.put("New York","Albany");
        capital.put("Washington","Olympia");
        capital.put("Michigan","Lansing");
        capital.put("California","Sacramento");
        capital.put("New Jersey","Trenton");
        capital.put("Texas","Austin");

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter state : ");
        String state = sc.nextLine();
        String capitl = capital.get(state);

        if(capitl != null)
        {
            System.out.println("capital of "+ state + " is " + capitl );
        }
        else{
            System.out.println("State not found in MAP");
        }

    }
}
