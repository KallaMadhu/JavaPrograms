import java.util.*;
public class ArithmeticOperators 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter int value:\t");
        int a=scan.nextInt();
        System.out.print("enter another int value:\t");
        int b=scan.nextInt();
        int c=a+b;
        System.out.printf("%d+%d=%d\n",a,b,c);
        c=a-b;
        System.out.format("%d-%d=%d\n",a,b,c);
        c=a*b;
        System.out.format("%d*%d=%d\n",a,b,c);
        c=a/b;
        System.out.format("%d/%d=%d\n",a,b,c);
        c=a%b;
        System.out.format("%d %% %d=%d\n",a,b,c);

    }
}