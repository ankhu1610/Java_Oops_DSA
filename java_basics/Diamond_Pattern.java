package java_basics;

import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
//        System.out.println("enter the number for diamond height ");
        int n = 8;//new Scanner(System.in).nextInt();
        for (int i = 1;i<=2*n-1;i++)
        {
            if(i <= n) {
                for (int j = i;j<n;j++ )
                {
                    System.out.print(" ");
                }
                for (int j =1; j<= i;j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
            else{
                for (int j = i;j> n;j--)
                {
                    System.out.print(" ");
                }
                for (int j = i;j <= 2*n-1;j++)
                {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}
