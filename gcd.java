import java.util.*;

public class gcd {
    public static void main(String args[])
    {
        System.out.println("enter number:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
         int ans =hcf(n1,n2);
        System.out.println(ans);
        
    }
    public static int hcf(int n1,int n2)
{
    if(n2 != 0)
    {
        hcf(n2,n1%n2);
    }
    else{
        return n1;
    }
    return 1;
    
}
}
// /**
//  * @param n1
//  * @param n2
//  */
// public static int hcf(int n1,int n2)
// {
//     if(n2 != 0)
//     {
//         hcf(n2,n1%n2);
//     }
//     else{
//         return n1;
//     }
// }