package DSA.Stack;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class PreviousGreaterElement {
    static int[] previousGreatestElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int secans[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }

            secans[i]  = stack.isEmpty() ? 0 : stack.peek();
            stack.push(i);
        }
        return secans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,8,12,9,7,6};
        arr =  previousGreatestElement(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }

    }
}
