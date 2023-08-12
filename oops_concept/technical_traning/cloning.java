package oops_concept.technical_traning;
 class MyClass {
    private int privateField1;
    private String privateField2;

    public MyClass(int privateField1, String privateField2) {
        this.privateField1 = privateField1;
        this.privateField2 = privateField2;
    }

    public MyClass(MyClass other) {
        this.privateField1 = other.privateField1;
        this.privateField2 = other.privateField2;
    }
    void new1(MyClass other)
    {
        this.privateField1 = other.privateField1;
        this.privateField2 = other.privateField2;
        System.out.println(privateField1+privateField2);
    }        // Other methods and fields...

}



public class cloning implements Cloneable{

    private String name ;
    final int rollno ;
     final int i = 5;
    cloning(int rollno)
    {

        this.rollno = rollno;
    }
    cloning(String name,int rollno)
    {
        this(rollno);
        this.name = name;

    }
    void getter()
    {
        System.out.println(name + rollno);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object instanceof cloning){
            cloning p = (cloning) object; // Downcasting
            if(this.name.equals(p.name) && this.rollno == p.rollno ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)throws CloneNotSupportedException {

        cloning cl = new cloning("ankit",67);
        cloning cl1 = (cloning)cl.clone();
        cl.getter();
        cl1.getter();
        MyClass myClass = new MyClass(14,"ANKIT");
//        MyClass myclass1 = (MyClass) myClass.clone();
    }
}
