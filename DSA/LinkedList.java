package DSA;
class node<T>
{
    T data;
    node next;
    node(T data)
    {
        this.data = data;
        next = null;
    }

}

public class LinkedList {
    static void middleElement(node<Integer> root)
    {
        node<Integer> slow = root;
        node<Integer> fast = root.next;
        fast= fast.next;
        while(fast!= null)
        {
            slow = slow.next;
            fast= fast.next;
            if(fast != null)
            {
               fast = fast.next;
            }
        }
        System.out.println("middel element "+slow.data);
    }
    static void kthElementFromLast(int k,node<Integer> root )
    {
        node<Integer> head = root;
        node<Integer> second = root;

        for(int i = 0;i<=k;i++)
        {
            head= head.next;


        }
        while(head != null)
        {
            head = head.next;
            second = second.next;
        }
        System.out.println("kth element from the last is "+second.next.data);

    }
    public static void main(String[] args) {
        node<Integer> root = new node<>(16);
        node<Integer> obj = new node<>(18);
        root.next = obj;
        node<Integer> obj1 = new node<>(52);
        node<Integer> obj2 = new node<>(25);
        node<Integer> obj3 = new node<>(99);
        node<Integer> obj4 = new node<>(13);
        node<Integer> obj5 = new node<>(15);
        obj.next = obj1;
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;
        node<Integer> head = root;
        kthElementFromLast(2,root);
        middleElement(root);


    }
}
