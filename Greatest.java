import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter 2 int values:\t");
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
        {
            System.out.printf("%d is greater than %d\n",a,b);
        }else
        {   System.out.printf("%d is less than %d\n",a,b);
        }
    }
}
