class One
{   static int s;
    int a,b;
    One()
    {   System.out.println("Default constructor");
    }
    One(int a)
    {   this(); 
        System.out.println("single param constructor...");
    }
    One(int a,int b)
    {   this(1000);
        System.out.println("Parameterized constructor");
        this.a=a;
        this.b=b;
    }
    void display()//o1
    {
        System.out.println("OBject state..");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
public class ThisDemo 
{
    public static void main(String[] args) 
    {
        //o1=1002
        One o1=new One(100,200);
        o1.display();
    }
}

/*
 java ThisDemo   
 
 //jvm will be invoked
 //jvm tells the class loader to load the ThisDemo class into method area
 
 */
