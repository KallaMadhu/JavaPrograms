import java.lang.*;
class One
{
    int a,b,c;
    One(int a)
    {
        System.out.println("single param constructor....");
        a=a;
    }
    One(int a,int b)
    {   this(a);
        System.out.println("double param constructor");
        b=b;
    }
    One(int a,int b,int c)
    {
        this(a,b);
        System.out.println("triple param constructor");
        c=c;

    }
    void display()
    {
        System.out.println("instance method...");
        System.out.println("a:\t"+a);
        System.out.println("b:\t"+b);
        System.out.println("c:\t"+c);
    }
}
public class ThisDemo2 
{
    public static void main(String[] args) 
    {
          One o1=new One(1000,2000,3000);      
          o1.display();
    }    
}

/*
 output:
 single param constructor....
double param constructor
triple param constructor
instance method...      
a:      0
b:      0
c:      0
 */