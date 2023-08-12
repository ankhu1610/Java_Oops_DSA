package oops_concept.Overriding_Overloading;
class Parent
{
    static void printKaro()
    {
        System.out.println("parent print karr diya re mainai ");
    }
}
class Child extends Parent{

    static void printKaro()
    {
        System.out.println("child print karr diya re ");
    }
    static void aurBataou()
    {
        Child child = new Child();
        child.printKaro();
    }

}

public class StaticMethodsOverridingFun {

}
