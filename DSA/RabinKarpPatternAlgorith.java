package DSA;

import javax.swing.*;

public class RabinKarpPatternAlgorith {
    static long hashValue(String pattern)
    {
        long hashValue = 0;
        for(int i = 0;i< pattern.length();i++)
        {
          hashValue += pattern.charAt(i)*Math.pow(10,(pattern.length()-1)-i);

        }
        return hashValue;
    }
    static int matchingPattern(String string,long pattern,String patt)
    {
        long checkPattern = hashValue(string.substring(0,patt.length()));
        System.out.println(checkPattern);
        System.out.println(pattern);
        int i = 0;
        for( i = 1;i<=string.length()- patt.length();i++)
        {
            if(checkPattern == pattern)
            {
                return i-1;
            }
            long firstchar = string.charAt(i-1)* (long) Math.pow(10,patt.length()-1);
            checkPattern -= firstchar;
            checkPattern *=10;
            checkPattern += string.charAt(i+patt.length()-1);
            System.out.println(checkPattern+"                  3");
        }
        System.out.println(checkPattern+"                  3");
        if(checkPattern == pattern)
        {
            return i-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        String string ="abdacebddabc";
        String pattern ="abc";
        long patternHashCode = hashValue(pattern);
        System.out.println( matchingPattern(string,patternHashCode,pattern));
    }
}
