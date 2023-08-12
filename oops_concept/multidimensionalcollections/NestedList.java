package oops_concept.multidimensionalcollections;

import java.util.ArrayList;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();


        List<List<Integer> > lst= new ArrayList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        al.add(new ArrayList<>());


        al.get(0).add(5);
        System.out.println(al.size());


        System.out.println(al.get(0));
    }
}
