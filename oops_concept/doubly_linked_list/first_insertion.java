package oops_concept.doubly_linked_list;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class first_insertion {


    Locale  locale = new Locale("en","US");
    ResourceBundle rb = ResourceBundle.getBundle("oops_concept.doubly_linked_list/Message",locale);


    static node add_first(node head)
    {
        System.out.println("enter the string");
        String str = new Scanner(System.in).nextLine();
        node obj = new node(str);
        obj.next_node = head;
        if(head != null) {
            head.left_node = obj;
        }
        head = obj;
        return  head;
    }
    static node  add_last(node head)
    {
        first_insertion obj1 = new first_insertion();
        System.out.println(obj1.rb.getString("str"));
        String str = new Scanner(System.in).nextLine();
        node obj = new node(str);
        node first = head;
        while(first.next_node != null)
        {
            first = first.next_node;
        }
        first.next_node = obj;
        return head;
    }
    static node add_in_index(node head)
    {
        first_insertion obj1 = new first_insertion();
        System.out.println(obj1.rb.getString("index"));
        int value = new Scanner(System.in).nextInt();
        System.out.println(obj1.rb.getString("str"));
        String str = new Scanner(System.in).nextLine();
        node node1 = new node(str);
        node  obj = head;

        for(int i = 0;i<value;i++)
        {
            obj = obj.next_node;
        }
        node right = obj.next_node;
        obj.next_node =node1;
        node1.left_node = obj;
        node1.next_node = right;
        right.left_node = node1;

        return head;
    }
    static void printLinkedList(node head)
    {
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next_node;
        }
    }
    public static void main(String[] args) {
        first_insertion obj1 = new first_insertion();
        node head = null;
        outer:
        while(true)
        {
            System.out.println(obj1.rb.getString("whole"));
            int choice = new Scanner(System.in).nextInt();
            switch (choice)
            {
                case 1:head = add_first(head);
                break ;
                case 2:head =  add_last(head);
                break ;
                case 3: head = add_in_index(head);
                    break;
                case 4:
                    System.out.println(obj1.rb.getString("quit"));
                    break outer;
                case 5:
                    printLinkedList(head);
                    break;
                default:
                    break ;
            }

        }

    }
}
