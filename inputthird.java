package Basicjava;

import java.util.Scanner;
public class inputthird {
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        double n =sc.nextDouble();
        int x= (int)n;
        if (n-x==0) {
            System.out.println("it is an integer");
        }
        else{
            System.out.println(" not an integer");
        }


    }
}
