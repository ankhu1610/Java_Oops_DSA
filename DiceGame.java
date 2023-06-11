package DSA;

import java.util.ArrayList;

public class DiceGame {
    static ArrayList<String> sumFinding(int n,String str,ArrayList<String> al)
    {
        if(n == 0)
        {
            al.add(str);
            return al;
        }
        if(n < 0)
        {
            return al;
        }
        al = sumFinding(n-1,str+'1',al);
        al = sumFinding(n-2,str+'2',al);
        al = sumFinding(n-3,str+'3',al);
        al = sumFinding(n-4,str+'4',al);
        al = sumFinding(n-5,str+'5',al);
        al = sumFinding(n-6,str+'6',al);
        return al;
    }
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        sumFinding(10,"",al);
        System.out.println(al.size());
        System.out.println(al);

    }
}
