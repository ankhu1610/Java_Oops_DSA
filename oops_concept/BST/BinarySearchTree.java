package oops_concept.BST;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.*;
public class BinarySearchTree {
    static class Node{
        int data;
        Node left_ptr = null;
        Node right_ptr = null;
        Node(int data)
        {
            this.data = data;
        }
    }
    static  Node insertion(Node root,int data){
        Node node = new Node(data);
        if(root == null)
        {
            return node;
        }
        else
        {
            Node ne_root = root;
            Node ty = null;
            while(ne_root != null)
            {
               ty = ne_root;
               if(ne_root.data > data)
               {
                   ne_root = ne_root.left_ptr;

               }
               else
               {
                   ne_root = ne_root.right_ptr;
               }
           }
            ne_root = ty;
            if(ne_root.data > data)
            {
                ne_root.left_ptr = node;

            }
            else
            {
                ne_root.right_ptr = node;
            }
            return root;
        }

    }
    static void  inOrderTraversal(Node node)
    {
        if(node == null){
            return ;
        }
        else {


            inOrderTraversal(node.left_ptr);
            System.out.println(node.data);
            inOrderTraversal(node.right_ptr);
        }
    }
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle rb = ResourceBundle.getBundle("oops_concept.BST/Messsage",locale);
        Node node = null;
        while(true)
        {
            System.out.println(rb.getString("inf"));
            int data = new Scanner(System.in).nextInt();
            if(data == 1)
            {
                System.out.println(rb.getString("display"));
                int data1 = new Scanner(System.in).nextInt();
                node = insertion(node,data1);
            }
            else if (data == 2)
            {
                inOrderTraversal(node);
            }
            else
            {
                break;
            }
        }
    }
}
