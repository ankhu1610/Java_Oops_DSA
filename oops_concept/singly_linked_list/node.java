package oops_concept.singly_linked_list;

class node{
    String data;
    node Node;
    node(String data)
    {
        this.data = data;
        this.Node = null;
    }
    node(String data,node Node)
    {
        this.data = data;
        this.Node = Node;
    }
}