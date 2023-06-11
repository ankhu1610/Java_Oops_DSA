//Write a recursive function that takes a list of numbers as an input and return product of all numbers in list



package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementProduct {
    static ArrayList<Integer> product(ArrayList<Integer> arr ,int index)
    {
        if(index == 0)
        {
            arr.remove(index);
            return arr;
        }
        int val = arr.get(index);
        for(int i = index-1;i >= 0;i--)
        {
            arr.add( arr.get(i)*val);

        }
        arr.remove(index);
        arr = product(arr,--index);

        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(5,2,6,7));
        product(alist,3);
        System.out.println(alist);
    }
}
