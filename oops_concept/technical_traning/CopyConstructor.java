package oops_concept.technical_traning;

public class CopyConstructor extends Object{
    int data;
    String str;
    CopyConstructor(int data,String str)
    {
        this.data = data;
        this.str = str;
    }
    CopyConstructor(CopyConstructor object)
    {
        this.data = object.data ;
        this.str = object.str;
    }
    @Override
    public boolean equals(Object object)
    {
        if(this == object)
        {
            return  true;

        }

        if(object instanceof CopyConstructor)
        {
            object = (CopyConstructor) object;
            if(this.str.equals(((CopyConstructor) object).str)&& this.data == ((CopyConstructor) object).data)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {

    }

}
