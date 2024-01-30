enum Colors{RED,GREEN,BLUE}
public class EnumDemo1 
{
    public static void main(String[] args) 
    {   //a is an int type variable
        //in variable a I can store only integer value
        int a=10;
        //c1 is an Colors type variable
        //in variable c1 I can store only either RED,GREEN OR BLUE
        Colors c1=Colors.RED;
        System.out.println("a="+a);
        System.out.println("c1="+c1);
    }
}