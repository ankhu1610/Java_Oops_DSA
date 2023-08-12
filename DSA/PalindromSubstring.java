package DSA;

public class PalindromSubstring {
    public static boolean isPalindrome(String STR)
    {
        int low = 0;
        int high = STR.length()-1;
        while(low< high)
        {
           if(STR.charAt(low) != STR.charAt(high))
           {
               return false;
           }
           low ++;
           high --;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aabccabbaa";
        for(int i = 0;i<str.length();i+=1)
        {
            for(int j = i+1;j<str.length();j++)
            {
                String temp = str.substring(i,j);
                if(isPalindrome(temp))
                {
                    System.out.println(temp);
                }
            }
        }


    }
}
