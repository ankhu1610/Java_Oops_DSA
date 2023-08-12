package java_basics;

public class optimized_prime_number {
    public static void main(String[] args) {
        int num = 5041;
        // int factorCount = 0;
        if(num ==1){
            System.out.println("1Not a Prime No");
            return ; // exit from the function
        }
        if(num == 2 || num == 3){
            System.out.println(" Prime No");
            return ; // exit from the function
        }
        if(num%2 == 0 || num % 3==0){
            System.out.println("2Not a Prime No");
            return ; // exit from the function
        }
        for(int i = 5 ; i<=Math.sqrt(num); i=i+6)
        {
            System.out.println(i+"  "+(i+2));
            if(num%i==0 || num%(i+2)==0){
                System.out.println("3Not a Prime No");
                return ; // exit from the function
            }
        }
        System.out.println("Prime Number");
        // for(int i = 2; i<=num-1 ; i++){
        //     if(num % i ==0){
        //         factorCount ++;
        //         break;
        //     }

        // }
        // System.out.println(factorCount==0?"Prime No ":"Not Prime Number");
        //System.out.println(factorCount==2?"Prime No ":"Not Prime Number");
    }
}
