package oops_concept.singly_linked_list;

import oops_concept.singly_linked_list.node;

import java.util.Scanner;

public class deletion_Linked_list {


    static node delete_first(node first)
    {
        first = first.Node;
        return first;
    }

    static node delete_last(node first)
    {
        node obj = first;
        node obj1 = first.Node;
        while(obj1.Node != null)
        {
            obj = obj1;
            obj1 = obj1.Node;

        }
        obj.Node = null;
        return first;
    }
    static node delete_index(node first,int index)
    {
        node obj = first;

        node obj1 = obj.Node;
        for (int i = 1;i< index;i++)
        {
            obj = obj1;
            obj1 = obj.Node;
        }
        obj.Node = obj1.Node;
        return first;
    }
    static void print_linked_list(node first)
    {
        while(first != null)
        {
            System.out.println(first.data);
            first = first.Node;
        }
    }
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

        System.out.println("enter " +
                "1: for deletion in first "
                +"2: for deletion in last "
                +"3: for deletion in index");
        int choice = new Scanner(System.in).nextInt();
        switch (choice)
        {
            case 1: head = delete_first(head);
                    break;
            case 2: head = delete_last(head);
                    break;
            case 3:
                System.out.println("enter the index value");
                int location = new Scanner(System.in).nextInt();
                head = delete_index(head,location);
                break;
            default :
                System.out.println("you have entered wrong ");
        }
        print_linked_list(head);
    }
}

