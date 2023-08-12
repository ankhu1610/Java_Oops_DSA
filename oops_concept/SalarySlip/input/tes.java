package oops_concept.SalarySlip.input;

public class tes {
    static int recur(int n){
        if( n ==1)
            return 1;
        else
            return n*recur(n-1);
    }
    public static void main(String[] args) {
        System.out.println("hellow world");
        System.out.println(recur(5));
    }
}
