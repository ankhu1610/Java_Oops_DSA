package oops_concept.tree;

public class Main {

    static int  idx = -1;
    public static Node createTree(int arr[])
    {
        idx++;
        if(arr[idx]== -1)
        {
            return null;
        }
        Node node1 = new Node(arr[idx]);
        node1.left =  createTree(arr);
        node1.right = createTree(arr);
        return node1;
    }
    public static  void printPreorder(Node node)
    {
        if(node != null) {
            System.out.print(node.data+" ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }
    public static void printInorder(Node node)
    {
        if (node != null)
        {
            printInorder(node.left);
            System.out.println(node.data);
            printInorder(node.right);

        }
    }

    public static void main(String[] arg)
    {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = createTree(nodes);
//        printPreorder(root);
//        System.out.println();
        printInorder(root);
    }
}
