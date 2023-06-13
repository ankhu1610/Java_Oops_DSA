package DSA;

public class CoinChangeProblem {
    public static long count(int coins[], int N, int sum) {
        if(sum == 0)
        {
            return 1;
        }
        if(sum < 0)
        {
            return 0;
        }
        if(sum  > 0 && N == coins.length)
        {
            return 0;
        }
        return count(coins,N,sum-coins[N])+ count(coins,N+1,sum);
    }
    public static void main(String[] args) {
        int count1[] = {2,5,3,6};
        System.out.println(count(count1,0,10));
    }
}
