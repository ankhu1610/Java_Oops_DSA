package oops_concept.technical_traning;
class parent
{
    parent()
    {
        System.out.println("hi i am the constructor of parent d");
    }
}
class child extends parent{
    child()
    {
//        super(); is runned implicitly that is why it is running like this
        System.out.println("hi i am the constructor of the child");
    }

}
public class Inheritance {
    public static void main(String[] args) {
       child ch = new child();
    }

}
