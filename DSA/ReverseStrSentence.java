package DSA;

public class ReverseStrSentence {
    static String reverse(String str)
    {
        char[] ch = str.toCharArray();
        int low = 0;
        int high = str.length()-1;
        while (low < high)
        {
            char temp = ch[low];
            ch[low]= ch[high];
            ch[high] = temp;
            high--;
            low++;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String str = "THE SKY IS BLUE";
        String[] newStr = str.split(" ");
        String temp = "";
        System.out.println(newStr.length);
        for(int i =newStr.length-1;i>=0;i--)
        {
            temp += newStr[i] + " ";
//            temp += reverse(newStr[i])+"";
        }
        System.out.println(temp);
    }
}
