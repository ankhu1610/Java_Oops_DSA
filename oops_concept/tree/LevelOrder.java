package oops_concept.tree;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LevelOrder {
    static class Nod{
        String data;
        Nod left = null;
        Nod right = null;
        Nod(String str){
            this.data = str;
        }
    }
    static int i = 0;
    static String[] levelOrder(Nod nod,String[] str)
    {
        Nod node = new Nod(str[i]);
        if(str[i] == "N"){
            
        }
        else{

        }
        return null;
    }
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle rb = ResourceBundle.getBundle("oops_concept.tree/message",locale);
        System.out.println(rb.getString("num"));
        int num = new Scanner(System.in).nextInt();
        String str[] = new String[num];
        for (int i = 0;i<num;i++)
        {
            System.out.println(rb.getString("display"));
            str[i] = new Scanner(System.in).next();
        }
    }
}
