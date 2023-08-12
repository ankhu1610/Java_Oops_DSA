package oops_concept.singly_linked_list;

import oops_concept.singly_linked_list.node;

import java.util.Scanner;

public class insertion_in_index_LL {
    public static void main(String[] args) {
        System.out.println("first you create a linked list");
        System.out.println("enter number of node");
        int n = new Scanner(System.in).nextInt();
        node head = null;
        node last = null;
        for (int i = 0;i<n;i++)
        {
            System.out.println("enter the string ");
            String str = new Scanner(System.in).nextLine();
            node no = new node(str);
            if (i == 0) {
               head = no;

            }
            else{
                last.Node = no;

            }
            last = no;
        }

        System.out.println("enter the position you want to enter string");
        int index = new Scanner(System.in).nextInt();
        System.out.println("enter the string you want to enter string");
        String str = new Scanner(System.in).nextLine();
        node inseting_obj = new node(str);
        node ahead = head.Node;
        node first = head;
        for(int i = 1;i < index ;i++)
        {
            head = ahead;
            ahead = ahead.Node;
        }
        head.Node = inseting_obj;
        inseting_obj.Node = ahead;
        while(first != null)
        {
            System.out.println(first.data);
            first = first.Node;
        }
    }
}