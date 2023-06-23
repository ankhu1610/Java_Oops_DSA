package DSA;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NthLargestElement {
    public static void main(String[] args) {
        System.out.println("Enter number of element you want in array");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b)-> b - a);

        for (int i = 0;i<num;i++)
        {
            arr[i] = scan.nextInt();
            priorityQueue.add(arr[i]);
        }
        System.out.println("enter the nth largest element you want to search");
        int nth = scan.nextInt();
        for(int i = 0;i<nth-1;i++)
        {
            priorityQueue.poll();
        }


        System.out.println(nth+" largest element "+priorityQueue.poll());
    }
}
