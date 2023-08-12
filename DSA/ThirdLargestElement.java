package DSA;
import java.util.*;
public class ThirdLargestElement {
    public static void main(String[] args) {
        System.out.println("Enter number of element you want in array");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)-> b - a);

        for (int i = 0;i<num;i++)
        {
            arr[i] = scan.nextInt();
            priorityQueue.add(arr[i]);
        }

        for(int i = 0;i<2;i++)
        {
            priorityQueue.poll();
        }


        System.out.println("Third largest element "+priorityQueue.poll());
    }
}
