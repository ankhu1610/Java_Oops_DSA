package oops_concept.SalarySlip.input;

//import jdk.swing.interop.SwingInterOpUtils;

//import java.util.Enumerat
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageReader {

    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle rb = ResourceBundle.getBundle("oops_concept.SalarySlip.input/input",locale);
//        Locale locale_hindi = new Locale("hi","IN");
//        ResourceBundle rb_hi = ResourceBundle.getBundle("oops_concept.SalarySlip/input",locale_hindi);

        System.out.println(rb.getString("input.id"));
        System.out.println(rb.getString("input.name"));
        System.out.println(rb.getString("input.salary"));


//        hindi
//        System.out.println(rb_hi.getString("input.id"));
//        System.out.println(rb_hi.getString("input.name"));
//        System.out.println(rb_hi.getString("input.salary"));


    }
}
