package DSA.Stack;

import java.util.Stack;

public class NextSmallerElement {
    static int ans[] = new int[8];
    public static void nextSmallerElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int temp = arr.length;
        System.out.println(temp);

        for(int i = arr.length-1 ;i>= 0 ;i--)
        {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? 7 : stack.peek();
            stack.push(i);

        }


    }
    public static void main(String[] args) {
        int[] arr = {3,10,5,1,15,10,7,6};
        nextSmallerElement(arr);
        for(int i =0 ;i<8;i++)
        {
            System.out.print(" "+ans[i]);
        }
    }
}
