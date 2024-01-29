import java.util.*;
public class Greatest2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter 3 int values:\t");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        //a=100
        //b=200
        //c=200
        if(a==b && a==c)  //true && true => true
        {
            System.out.println("Shame Shame...");
        }else if(a==b && a>c){
            System.out.println("a and b are equal and greater than c");
        }else if(a==c && a>b){
            System.out.println("a and c are equal and greater than b");
        }else if(b==c && b>a){
            System.out.println("b and c are equal and greater than a");
        }
        else if(a>b && a>c)
        {
            System.out.println("a is greaterthan b and c");
        }else if(b>c)
        {
            System.out.println("b is greaterthan a and c");
        }else
        {
            System.out.println("c is greaterthan a and b");
        }
    }
}
