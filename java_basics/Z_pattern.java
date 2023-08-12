package java_basics;

import java.util.Scanner;

public class Z_pattern {
    public static void main(String[] args) {
        System.out.println("ENTER HEIGHT OF Z");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0;i<n;i++)
        {
            for (int j = 0;j<n;j++)
            {
                if(i ==0||i==n-1||(i+j) == n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
