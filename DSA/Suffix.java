package DSA;

public class Suffix {
    public static void main(String[] args) {
        String str = "ankit";
        String temp = "";
        for(int i =  str.length()-1;i>= 0;i--)
        {
             temp = str.charAt(i)+ temp ;
//                StringBuilder stringBuilder =  new StringBuilder(temp);
//                stringBuilder.reverse();
//                String tempo = stringBuilder.toString();
            System.out.println(str.substring(str.length()-1-i,str.length()-1));
        }
    }
}
