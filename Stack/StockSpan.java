package DSA.Stack;

import java.util.Stack;

public class StockSpan {
    static void  previousGreatestArray(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<arr.length;i++)
        {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }
            System.out.print(" ");
            System.out.print(stack.isEmpty() ? 1 : stack.peek());
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        previousGreatestArray(arr);
    }
}
