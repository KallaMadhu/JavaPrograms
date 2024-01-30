import java.util.*;
public class Addition 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        byte a=scan.nextByte();
        byte b=scan.nextByte();
        float r1=0;
        r1=a+b;
        System.out.println(r1);
        r1=a-b;
        System.out.println(r1);
        r1=a*b;
        System.out.println(r1);
        r1=a/(float)b;
        System.out.println(r1);
        r1=a%b;
        System.out.println(r1);
    }
}
