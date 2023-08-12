package java_basics;

import java.util.Scanner;

public class SandBox_Glass_Pattern {
    public static void main(String[] args) {
        System.out.println("ENTER THE HALF HEIGHT");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1;i<= n*2-1;i++)
        {
            if(i<= n) {
                for (int j =1;j<i;j++)
                {
                    System.out.print(" ");
                }
                for (int j = n; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for (int j=i-n;j<n-1;j++ )
                {
                    System.out.print(" ");
                }
                for (int j = i+1;j> n;j-- )
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
