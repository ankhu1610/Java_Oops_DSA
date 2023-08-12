package oops_concept.Overriding_Overloading;

class Loan
{
    void show()
    {
        System.out.println("it is normal loan");
    }
    void interest()
    {
        System.out.println("it is the normal interest");
    }
}
class HomeLoan extends  Loan
{
    @Override
    void show()
    {
        System.out.println("it is home loan");

    }
    void time()

    {
        System.out.println( "the time required for this is 5 year to pay back");
    }

}
public class Overriding {
    public static void main(String[] args) {
        Loan loan = new HomeLoan();// UPCASTING
    loan.show();
    loan.interest();
//    HomeLoan homeLoan = new Loan();

    }
}
