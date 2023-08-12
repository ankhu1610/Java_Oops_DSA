//package DSA;
//import java.util.*;
//class Solution {
//    public int romanToInt(String s) {
//
//
//        HashMap<Character,Integer> hashMap = new HashMap<>();
//        hashMap.put('I',1);
//        hashMap.put('V',5);
//        hashMap.put('X',10);
//        hashMap.put('L',50);
//        hashMap.put('C',100);
//        hashMap.put('D',500);
//        hashMap.put('M',1000);
//        int temp = 0;
//        for(int i = 0;i<s.length()-1;i++)
//        {
//            if(hashMap.get(s.charAt(i)) >= hashMap.get(s.charAt(i+1)) )
//            {
//                temp += hashMap.get(s.charAt(i));
//            }
//            if(hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i+1)) )
//            {
//                temp -= hashMap.get(s.charAt(i));
//            }
//
//        }
//        if(hashMap.get(s.charAt(s.length()-1)) > hashMap.get(s.charAt(s.length()-2)))
//        {
//            temp += hashMap.get(s.charAt(s.length()-1));
//            return temp;
//        }
//        temp -= hashMap.get(s.charAt(s.length()-1);
//        return temp;
//    }
//}
//public class RomanToInteger {
//
//}
