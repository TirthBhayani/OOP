import java.text.SimpleDateFormat;
import java.util.*;

public class ac {
    private int ac_id;
    private String name;
    private double balance;

    public ac(int ac_id, String name, double balance) {
        this.ac_id = ac_id;
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println("accoont id : " + ac_id);
        System.out.println("name : " + name);
        System.out.println("balance : " + balance);
    }

    public static ac serch(ac[] accounts, int ac_id) {
        for (ac account : accounts) {
            if (account.ac_id == ac_id) {
                return account;
            }

        }
        return null;
    }

    public static void main(String args[]) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        ac[] accounts = new ac[5];
        accounts[0] = new ac(1, "tirth", 1000);
        accounts[1] = new ac(2, "dharmik", 2000);
        accounts[2] = new ac(3, "abhi", 3000);
        accounts[3] = new ac(4, "ayush", 4000);
        accounts[4] = new ac(5, "jeel", 5000);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter account number:");
        int acid = sc.nextInt();

        ac serchaccount = serch(accounts, acid);
        if (serchaccount != null) {
            System.out.println("account details :");
            serchaccount.display();
        } else {
            System.out.println("account not found");
        }
    }
}