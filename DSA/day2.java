package DSA;


public class day2 {
    static String replace(String str,int index)
    {
        if(str.length() == index )
        {
            return str;
        }
        if(str.charAt(index-1) == str.charAt(index))
        {
            str = str.substring(0, index) + '#'
                    + str.substring(index + 1);
        }
        return replace(str,index+1);
    }

    public static void main(String[] args) {
        System.out.println(replace("aabbcc",1));
    }

}
