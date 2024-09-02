import java.text.SimpleDateFormat;
import java.util.*;
public class banking {
    public static void main(String args[])
    {
         System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println(); 
        bank b1 = new bank();
        try{
        b1.deposit();
        b1.withdraw();
        b1.withdraw();
        b1.withdraw();
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class bank {
    int balance;
    public  void withdraw()throws InsufficientBalanceException
    {
        Scanner sc = new Scanner(System.in);
        int amount;
        System.out.println("enter withdraw amount ");
        amount = sc.nextInt();
        if(amount>balance)
        {
            throw new InsufficientBalanceException("INSUFFICIENT BALANCE !!");
        }
        else{
        balance = balance - amount;
        System.out.println("balacne after withdraw : "+balance);
        }
        
    }
    public  void deposit()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter deposit amount : ");
        balance = sc.nextInt();
        System.out.println("balance : "+balance);
    }
}

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String s)
    {
        super(s);
    }
}
