import java.text.SimpleDateFormat;
import java.util.*;

public class bank {
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println(); 

        Scanner sc = new Scanner(System.in);
        System.out.println("1.SavingAccount   2.FixedDepositAccount");
        int choice = sc.nextInt();
        switch(choice)
        {
        case 1 :
        System.out.println("__SavingAccount__");
        SavingAcoount s1 = new SavingAcoount();
        s1.openaccount();
        s1.deposit();
        s1.withdraw();
        s1.checkbalance();
        s1.interest();
        break;
        
        case 2 :
        System.out.println("__FixedDepositAccount__");
        FixedDeposit f1 = new FixedDeposit();
        f1.openaccount();
        f1.deposit();
        f1.withdraw();
        f1.checkbalance();
        f1.interest();
        break;
        }
        
    }
}
class BankAccount
{
    String name;
    int aadharnumber;
    double balance;
    int age;
    int flag;
    public void openaccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("___ENTER DETAILS___");
        System.out.println("Enter Name : ");
        this.name = sc.nextLine();
        System.out.println("Enter AadharNumber : ");
        this.aadharnumber = sc.nextInt();
        System.out.println("Enter age : ");
        this.age = sc.nextInt();
        if(age>=60)
        {
            flag = 0;
        }
        else{
            flag = 1;
        }
        this.balance = 0.0;
        System.out.println("___ ACCOUNT OPENED SUCCESSFULLY ___");
    }

    public void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deposit Amount : ");  
        double amount = sc.nextDouble();
        balance = balance + amount;
    }

    public void checkbalance()
    {
        System.out.println("Balance : " +balance);
    }

    public void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withdraw Amount : ");
        double withdraw = sc.nextDouble();
        if(withdraw > balance)
        {
            System.out.println(" !! INSUFFICIENT BALANCE !!");
        }
        else{
        balance = balance - withdraw;
        System.out.println("__withdraw successfully__");
        }
    }
}
class SavingAcoount extends BankAccount
{
    double interest = 0.04;
    public void interest()
    {
        if(flag == 0)
        {
            interest = 0.05;
        }
        interest = balance*interest;
        balance = balance + interest;
        System.out.println("__INTEREST ADDED__");
        System.out.println("Balance : "+balance);
    }
}
class FixedDeposit extends BankAccount
{
    int accountyears;
    double interestrate;
    
    Scanner sc = new Scanner(System.in);
    public void interest()
    {
        System.out.println("Enter Year : ");
        accountyears = sc.nextInt();
        if(accountyears == 1)
        {
            interestrate = 0.06;
        }
        else if(accountyears>1 && accountyears<5)
        {
            interestrate = 0.07;
        }
        else if(accountyears >= 5)
        {
            interestrate = 0.075;
        }
        if(flag == 0)
        {
            interestrate = interestrate + 0.01;
        }
        interestrate = balance*interestrate;
        balance = balance + interestrate;
        System.out.println("__INTEREST ADDED__");
        System.out.println("Balance : "+balance);
    }
}
