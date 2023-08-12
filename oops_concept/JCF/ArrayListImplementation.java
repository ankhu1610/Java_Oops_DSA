package oops_concept.JCF;


import java.util.ArrayList;

public class ArrayListImplementation {
    ArrayList<Integer> go(ArrayList<Integer> array,int n)
    {
        array.add(n);
        if(n == 1)
        {

            return array;
        }
        else
        {
            go(array,n-1);
        }
        return array;
    }

    public static void main(String[] args) {

        ArrayListImplementation obj = new ArrayListImplementation();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = obj.go(arrayList,5);
        System.out.println(arrayList);

    }
}
