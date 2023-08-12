package oops_concept.singly_linked_list;

import oops_concept.singly_linked_list.node;

import java.util.Scanner;

public class add_last_linked_list {
    public static void main(String[] args) {
        System.out.println("enter the number of string you want to enter");
        int n = new Scanner(System.in).nextInt();
        node head = null;
        node last = null;
        for (int i =0;i<n;i++)
        {

            System.out.println("enter the string ");
            String str = new Scanner(System.in).nextLine();
            node obj = new node(str,null);

            if(i == 0)
            {

                head = obj;

            }
            else
            {

                last.Node = obj;

            }
            last = obj;
        }
        while(head != null)
        {

            System.out.println(head.data);
            head = head.Node;
        }

    }
}