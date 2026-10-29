package pattern;
import java .util.Scanner;
public class numbersquare {
   public  static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
       for (int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
         //      System.out.print(j+" ");// agar alag alag number save karne ho
               System.out.print(i+" ");//same number print karne hoo
           }
           System.out.println();
       }


    }
}
