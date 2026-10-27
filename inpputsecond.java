package Basicjava;

import java.util.Scanner;
public class inpputsecond {
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n=sc.nextInt();
       if (n%5==0) {
           System.out.println("yes it is devisible by 5");
       }
       else {
           System.out.println("not devisible by 5");
       
       }


    }
}
