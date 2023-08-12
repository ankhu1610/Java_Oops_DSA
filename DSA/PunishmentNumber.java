package DSA;
class Solution1 {
    public int punishmentNumber(int n) {
        int sum = 0;
        for(int i= 1;i<=n;i++)
        {
            int temp = i*i;
            if(isValidNumber(temp,i))
            {
                // System.out.println(i);
                sum += temp;
            }
        }
        return sum;
    }
    public boolean isValidNumber(int temp,int n)
    {
        if(n < 0 || temp < n)
        {
            return false;
        }
        if(n == temp)
        {
            return true;
        }

        return isValidNumber(temp/10,n - temp%10) || isValidNumber(temp/100,n - temp%100) ||isValidNumber(temp/1000,n - temp%1000) ;
    }
}
public class PunishmentNumber {
    public static void main(String[] args) {
        Solution1 obj = new Solution1();
        System.out.println(obj.punishmentNumber(1000));

    }
}
