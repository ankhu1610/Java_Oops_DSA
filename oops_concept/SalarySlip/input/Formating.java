package oops_concept.SalarySlip.input;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formating {
    Locale locale = new Locale("en","IN");
    String date_format()
    {
        DateFormat date = DateFormat.getDateInstance(DateFormat.LONG,locale);
        Date date1 = new Date();
        return date.format(date1);

    }
    void string_format()
    {
        
    }
    String amount_format(double amount)
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(amount);
    }
    public static void main(String[] args) {

    }
}
