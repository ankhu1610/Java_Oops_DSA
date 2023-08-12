package java_basics;

import java.util.Scanner;

public class TEST {
    public static void main(String args[])
    {
//        boolean a = true;
//        boolean b = !true;
//        boolean c = a | b;
//        boolean d = a ^ b;
//        boolean e = d ? b : c;
//        System.out.println(b+" "+c+" "+d + " " + e);
//        double d1 = 5f; // p1
//        double d2 = 5.0; // p2
//        float f1 = 5f; // p3
//        float f2 = 5.0; // p4
//        int meal = 5;
//        int tip = 2;
//        int total = meal + (meal > 6 ? ++tip : --tip);
//        System.out.println(tip);
//        final int persons = 45;
//        int random = 45;
//        switch(random)
//        {
//            case persons : System.out.print("CRICKET ");
//            default: System.out.println("RUGBY");
//        }
//        outer:
//        for(int i=1; i<=4;i++)
//        {
//            inner:
//            for(int j=1; j<=4;j++)
//            {
//                if(j==1)
//                    break ;
//            }
//            System.out.print("A");
//        }

//        byte a = (byte)255;
//        System.out.println(a);
//        for(int i = 0; i < 5; i++) {
//            System.out.print(i++ + 5 + --i + ",");
//        }
//        int a = 20, b=30;
//        boolean result = a&b ? true:false;
//        System.out.println(result);
//        int g = 3;
//        System.out.print(++g * 8);
//        int a = 5;
//        int b = 10;
//        first:
//        {
//            second:
//            {
//                third:
//                {
//                    if (a ==  b >> 1)
//                        break second;
//                }
//                System.out.println(a);
//            }
//            System.out.println(b);
//        }

//        int a[] = {1,2,3,4,5};
//         int d[] = a;
//   int sum = 0;
//    for (int j = 0; j < 3; ++j)
//        sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
//   System.out.println(sum);

//        int i = 5;
//        while (i < 7) {
//            for (int k = 0; k < 2; k++) {
//                System.out.print(i);
//            }
//            i++;
//        }
//        byte x = 64;
//        int i;
//        byte y;
//        i = x << 2;
//        y = (byte) (x << 2);
//        System.out.print(i + " " + y);

//        Integer a = 200;
//
//        Integer b = 200;
//
//        Integer c = 10;
//
//        Integer d = 10;
//
//        System.out.println(a==b);
//
//        System.out.println(c==d);

//        int i=1, j=1;
//        while(i<3)
//        {
//            do
//            {
//                System.out.print(j + ",");
//                j++;
//            }while(j<4);
//            i++;
//        }
//        int d = 2_7_8;
//        System.out.println(d);

//        int i;
//        for (i = 1; i <= 12; i += 2) {
//            if (i == 8) {
//                System.out.println(i);
//                break;
//            }
//        }


//        int a = 2, b = 3, c = 4, d = 5;
//        float k = 4.3f;
//        int res = --b * a + c * d--;
//        System.out.println(res);

//        int a = 1;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;
//        d = a++;
//        c++;
//        b++;
//        ++a;
//        System.out.println(a + " " + b + " " + c);

//        int x=3, y=5,  z=10;
//        System.out.println( ++z + y - y + z + x++);

//        for(int i =0;;) {
//            System.out.println(i);
//        }

//        String forest = null;
//        String output = forest != null ? "Goblin" : "Amazon";
//        System.out.println(output);


//        boolean water = true;
//        while (water) {
//            System.out.println(water);
//            while (water) {
//                water = false;
//                System.out.println(water);
//            }
//        }
//        System.out.println(water);


//        outer:
//        for(int i=1; i<=2;i++)
//        {
//            inner:
//            for(int j=1; j<=2;j++)
//            {
//                if(j>i)
//                    break inner;
//                System.out.print(j +",");
//            }
//        }

//        System.out.println();
//        String str  = new Scanner(System.in).next();
//        System.out.println(str);

//        int a = 1;
//        int b = 2;
//        int c = 3;
//        a |= 4;
//        b >>= 1;
//        c <<= 1;
//        a ^= c;
//        System.out.println(a + " " + b + " " + c);

        int var1 = 5;
        int var2 = 6;
        int var3;
        var3 = ++ var2 * var1 / var2 + var2;
        System.out.print(var3);

    }
}
