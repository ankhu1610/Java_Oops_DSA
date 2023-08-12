package DSA;

import java.util.PriorityQueue;

public class test {
    static void prin(String arr,int index)
    {
        if(index == 0)
        {
            return;
        }
        if(index == 1)
        {
            arr += "hu";
        }
        if(index == 2);
        {
            arr += "hloo";
        }
        prin(arr,--index);
        System.out.println(arr +"  "+index);
    }
    public static void main(String[] args) {
        for(int i = 0;i< 5;i++)
        {
            for(int j = 0;j<6;j++)
            {
                if(i == 1 && j == 1)
                {
                    break;
                }
                System.out.println(i+" "+j);
            }
        }

    }
}
