package java_basics;
import java.util.*;
public class Demo {
    public static void main(String[] args) {

        HashMap<Integer,Integer> hash_map = new HashMap<Integer,Integer>();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hash_map.get(b) - hash_map.get(a));


    }
}
