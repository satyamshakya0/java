package Basicjava;

import java.util.Scanner;
public class elseif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length is :");
        double l = sc.nextDouble();
        System.out.println("breath is :");
        double b = sc.nextDouble();
        double area = (l * b);
        double parameter = 2*(l+b);
        if (area > parameter) {
            System.out.println("area is greater");
        } else{
            System.out.println("area is smaller");
        }
    }
}
