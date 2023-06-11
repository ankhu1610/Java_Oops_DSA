package DSA;

import java.util.ArrayList;

public class finding_subsequencees {
    static ArrayList<String > subsequennce(String str,ArrayList<String> alist)
    {
        if(str.length() == 0)
        {
            alist.add(str);
            return alist;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        subsequennce(str,alist);
        int num = alist.size();
        for(int i = 0;i<num;i++)
        {
            alist.add(alist.get(i)+ch);
        }
        return alist;
    }
    public static void main(String[] args) {
            ArrayList<String > list = new ArrayList<>();
            list = subsequennce("ankit",list);
        System.out.println(list);
        System.out.println(list.size());
    }
}
