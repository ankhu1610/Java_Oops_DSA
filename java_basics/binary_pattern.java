package java_basics;

import java.util.Scanner;

public class binary_pattern {
    public static void main(String[] args) {
        System.out.println("enter height ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1;i<=n;i++)
        {

                if(i% 2 == 1)
                {
                    for (int z = 1;z<=i;z++)
                    {
                        if (z%2 == 1)
                        {
                            System.out.print("1");
                        }
                        else
                        {
                            System.out.print("0");
                        }
                    }
                    System.out.println();
                }
                else
                {
                    for (int z = 1;z<=i;z++)
                    {
                        if (z%2 == 1)
                        {
                            System.out.print("0");
                        }
                        else
                        {
                            System.out.print("1");
                        }
                    }
                    System.out.println();
                }

        }

    }
}
