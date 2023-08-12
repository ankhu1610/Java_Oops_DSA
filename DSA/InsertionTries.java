package DSA;

public class InsertionTries {
    static class Node{
       Node[] children;
        boolean IsTerminal;
        public Node()
        {
            children = new Node[26];
            for(int i =0;i<26;i++)
            {
                children[i] = null;

            }
            IsTerminal = false;
        }
    }


    static void insertion(String str,Node root)
    {
        int temp  = str.charAt(0) - 'a';
        Node   current = root;
        for(int i = 0;i< str.length();i++)
        {
             temp  = str.charAt(i) - 'a';
            if(root.children[temp] == null)
            {
                root.children[temp] = new Node();

            }
            if(str.length()-1 == i)
            {
                root.children[temp].IsTerminal = true;
            }
            root = root.children[temp];

        }

    }

    public static void main(String[] args) {

        String str = "ankit";
        Node root = new Node();
        insertion(str,root);
    }
}
