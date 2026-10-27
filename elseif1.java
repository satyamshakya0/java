package Basicjava;

import java.util.Scanner;
public class elseif1 {
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        if(n> 999 && n>1000) {
            System.out.println("yes it is a 4 digit number ");
        }
        else{
            System.out.println("it is not a 4 digit number ");
        }
        }
    }