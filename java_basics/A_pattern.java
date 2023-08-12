package java_basics;

import java.util.Scanner;

public class A_pattern {
    public static void main(String[] args) {
        System.out.println("ENTER THE HEIGHT OF A");
        int n = new Scanner(System.in).nextInt();
        for (int i  =0;i<n;i++)
        {
            for (int j = 0;j<n-i;j++)
            {
                System.out.print(" ");
            }

                System.out.print("@");

            if(i!= 0)
            {
                if(i == n/2)
                {
                    for(int z = 0;z<(2*(i-1)+1);z++)
                    {
                        System.out.print("@");
                    }
                }
                else {
                    for (int j = 0; j < (2 * (i) - 1); j++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("@");
            }

            System.out.println();
        }
    }
}
