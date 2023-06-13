package DSA;

public class TowerOfHanoi {
    static void printHanoiPath(int n ,char l,char m,char d)
    {
        if(n == 1)
        {
            System.out.println(l+"-->"+d);
            return;
        }
        printHanoiPath(n-1,l,d,m);
        System.out.println(l+"-->"+d);
        printHanoiPath(n-1,m,d,l);
    }
    public static void main(String[] args) {
        printHanoiPath(4,'L','M','D');
    }
}
