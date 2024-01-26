class One
{   int a,b;
    One(int a,int b)
    {   System.out.println("one class constructor..");
        this.a=a;
        this.b=b;
    }
    void display() //o1
    {   System.out.println("Object state...");
        System.out.println("a:\t"+a); 
        System.out.println("b:\t"+b);
    }
}
class Two
{   
    One o1;
    Two(One o1)
    {this.o1=o1;
    }
}
public class PassingObjectToConstructor 
{
    public static void main(String[] args) 
    {   //obj=1002
        One obj=new One(100,200);
        Two t1=new Two(obj);  //Two(1002)
        //t1=2002
        t1.o1.display();  //method calling
    }
}