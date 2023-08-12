package oops_concept.tt16march;

public class TypePromotion {
    void show(int a)
    {
        System.out.println(a+"int");
    }
    void show(long a)
    {
        System.out.println(a+"long");
    }
    void show(short a)
    {
        System.out.println(a+"short");
    }
    void show(byte a)
    {
        System.out.println(a+"byte methods");

    }
    void show(char a)
    {
        System.out.println(a+"char method");
    }
    void show(Integer a)
    {
        System.out.println(a+"Integer methods");
    }
    void show(int ... a)
    {
        System.out.println("var arguments");
    }
    public static void main(String[] args)
    {
        TypePromotion tp = new TypePromotion();
        tp.show(5,7);

    }
}
