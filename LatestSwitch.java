import java.util.*;
public class LatestSwitch 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.add");    
        System.out.println("2.sub");    
        System.out.println("3.multi");    
        System.out.printf("Select Your Option:\t");    
        int opt=scan.nextInt();
        //we can pass either char or int or string or enum
        System.out.println("Enter 2 integers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=0;
        switch(opt)
        {
            case 1->{
                        c=a+b;
                        System.out.printf("%d + %d=%d",a,b,c);
                    }
            case 2->{
                    c=a-b;
                    System.out.printf("%d - %d=%d",a,b,c);
                }
            case 3->{
                    c=a*b;
                    System.out.printf("%d * %d=%d",a,b,c);
                }
            default-> System.out.println("Invalid Option");
        }
    }    
}
