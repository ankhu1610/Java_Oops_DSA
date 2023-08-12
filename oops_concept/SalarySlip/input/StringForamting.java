package oops_concept.SalarySlip.input;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class StringForamting {
    public String  stringForamte(String  str)
    {
//        System.out.println("1 "+str);


        String first  = String.valueOf(str.charAt(0)).toUpperCase();
        String last = str.substring(1).toLowerCase();
//        System.out.println("string format "+str);
        return first+last;
    }


    public String stringArrayCreator(String  str)
    {
        str = str.trim();
        String[] arr = str.split(" ");
        String full = "";

        for (String st : arr)
        {
//            System.out.println("string arry "+st);
            full =  full + stringForamte(st) + " ";
        }
        return full;
    }

    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle rb = ResourceBundle.getBundle("oops_concept.SalarySlip.input/input",locale);
        System.out.println(rb.getString("input.name"));
        String full_name = new Scanner(System.in).nextLine();
        StringForamting sf = new StringForamting();
        System.out.println( sf.stringArrayCreator(full_name).trim());
    }
}
