package java_basics;

import java.util.Scanner;

public class Traingle_pattern {
    public static void main(String[] args) {
        System.out.println("enter the height of TRIANGLE");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0;i< n;i++)
        {
            if(i == 0)
            {
                for (int j = 0;j<n-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            else if(i== n-1)
            {
                for (int j = 0;j<2*n-1;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for (int j = i;j<n-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0;j<2*i-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
