package java_basics;

public class nested_star {
    static void nested_star(int str,int row)
    {
        if(row == 0)
        {
            return ;

        }
        if(str >0)
        {
            System.out.print("*");
            nested_star(str-1,row);
        }
        if(str == 0)
        {
            System.out.println();
            nested_star(row-1,row-1);
        }




    }
    public static void main(String[] args) {
        nested_star(5,5);
    }
}
