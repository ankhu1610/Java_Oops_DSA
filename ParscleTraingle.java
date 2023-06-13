package DSA;

import java.util.ArrayList;

public class ParscleTraingle {
    static void printPascale(int m)
    {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        for(int i= 1;i<m;i++)
        {
            arrayList.add(new ArrayList<Integer>());
            for(int j= 1;j<=i;j++)
            {
                if(j == 1 )
                {
//                    System.out.println(1);

                    arrayList.get(i-1).add(1);
                }
                if(j == i)
                {
                    arrayList.get(i-1).add(1);
                }
                else
                {

                    int temp = arrayList.get(i-2).get(j-1);
                    int temp1 = arrayList.get(i-2).get(j)+ temp;

                    arrayList.get(i-1).add(temp1);
                }
            }
        }
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        printPascale(7);
    }
}
