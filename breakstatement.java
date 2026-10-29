package loops;
import java.util.Scanner;
public class breakstatement {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the number:");
         int n = sc.nextInt();
        boolean flag = true; //true means prime

         for (int i = 2; i <= n - 1; i++) {
             if (n % i == 0) {
                 flag = false;// false mens composite number
                 break;
             }

         }
         if ( n==1) System.out.println(" neither prime nor composite ");
         else if (flag == false) System.out.println("composite number");
        else System.out.println("prime number ");
     }

}
