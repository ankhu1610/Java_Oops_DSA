package DSA;
import java.lang.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "ACT";
        String str2 = "CAT";
        StringBuilder string1 = new StringBuilder(str1);
        StringBuilder string2 = new StringBuilder(str2);
        System.out.println(string1);
        if(string1.length() == string2.length())
        {
            for (int i = 0;i<string2.length();i++)
            {
                if(str1.indexOf(string2.charAt(i)) >=0)
                {
//                    System.out.println("1");
                    int index = str1.indexOf(string2.charAt(i));
//                    System.out.println(index);
                   StringBuilder string3 = string1.deleteCharAt(index);
                    System.out.println(string3);

                }
                else
                {
                    System.out.println("not an anagram");
                    break;
                }
            }
        }
        else
        {
            System.out.println("not an anagram");
        }
    }
}
