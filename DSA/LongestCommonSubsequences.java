package DSA;

import java.util.ArrayList;

public class LongestCommonSubsequences {
    public static void main(String[] args) {
        String str1 ="abcd";
        String str2 = "aebyc";
//        firstly generating common subsequences
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(" ");
        for (int i = 0;i<str1.length();i++)
        {
            String temp = String.valueOf(str1.charAt(i));
            int length = arrayList.size();
            for(int j = 0;j<length;j++)
            {
                arrayList.add(arrayList.get(j)+temp);

            }
        }

//        generation of common subsequences
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(" ");
        for (int i  = 0;i<str2.length();i++)
        {
            String temp  = String.valueOf(str2.charAt(i));
            int length = arrayList.size();
            for (int j = 0;j<length;j++)
            {
                arrayList1.add(arrayList1.get(j)+temp);
            }
        }



//        now comparision  begin
        int maxCount = 0;
        String longestSubsequence = "";
        for(int i = 0;i<arrayList.size();i++)
        {
            String temp = arrayList.get(i);
            for (int j = 0;j<arrayList1.size();j++)
            {
                if(temp.compareTo(arrayList1.get(j)) == 0 && temp.length() > maxCount)
                {
                    longestSubsequence = temp;
                    maxCount = temp.length();
                    break;
                }
            }
        }
        System.out.println(" "+longestSubsequence+"  "+maxCount);
    }
}
