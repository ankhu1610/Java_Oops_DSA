package DSA;

public class KnuthMorrisPatternAlgorithm {
    static int[] prefixPattern(String str)
    {
        int[] arr = new int[str.length()];
        int j = 0;
        char ch = str.charAt(0);
        arr[0] = 0;
        for(int i = 1;i<str.length();i++)
       {
           j = arr[i-1];
//           System.out.println("i "+i);
           while(j > 0 && str.charAt(i) != str.charAt(j))
           {
               j = arr[j-1];
//               System.out.println("//"+j+" i"+i );
           }
           if(str.charAt(i) == str.charAt(j))
           {
              j++;
           }
           arr[i] = j;

       }
        return arr;
    }
    static int patternMatching(String str,String pattern,int[] pi)
    {
        int j = 0;
        for(int i = 0;i<str.length();i++)
        {
            if( j == pattern.length()-1 && str.charAt(i) == pattern.charAt(j) )
            {
                return i-pattern.length()+1;

            }
            else if(str.charAt(i) ==pattern.charAt(j))
            {
//                System.out.println(i);
                j++;

            }
            else if(j>0 && str.charAt(i) !=pattern.charAt(j)){
//                System.out.println("hlow "+i);
                i--;
                j = pi[j-1];

            }
            else if(j==0 &&str.charAt(i) != pattern.charAt( pi[j]))
            {

            }

        }
        return -1;
    }
    public static void main(String[] args) {
            String str = "ababcabcabababd";
            String pattern ="ababd";
            int[] arr = prefixPattern(pattern);

        System.out.println();
        System.out.println(patternMatching(str,pattern,arr));

    }
}
