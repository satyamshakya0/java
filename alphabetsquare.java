package pattern;
import java.util.Scanner;
public class alphabetsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                //      System.out.print((char)(j+64)+" ");// big and diffrent alphabet print karne ke liye
                //       System.out.print((char)(i+64)+" ");//big and same alphabet print karne ke liye
                //   }
                //  System.out.println();
              //  System.out.print((char) (j + 96) + " ");// small and diffrent alphabet ke liye
                System.out.print((char) (i + 96) + " ");//small and diffrent alphabet ke liye

            }
            System.out.println();
        }
            }
}
