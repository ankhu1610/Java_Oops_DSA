package DSA;

import java.util.ArrayList;

public class MazePath {
    static ArrayList<String> pathFind(int m,int  n,String str,ArrayList<String >alist)
    {

        if(m == 3 || n == 3)
        {

            return alist;
        }
        if(m == 2 && n == 2)
        {

            alist.add(str);
            return alist;
        }

        alist = pathFind(m+1,n,str+'D',alist);
        alist = pathFind(m,n+1,str+'R',alist);

        return alist;

    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = pathFind(0,0,"",arrayList);
        System.out.println(arrayList);
    }
}
