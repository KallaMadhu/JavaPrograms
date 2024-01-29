import java.util.*;
public class VowelOrNot2 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a character:\t");
        String s1=scan.next();  //s1="a"
        s1=s1.toUpperCase();   //s1="A"
        char ch1=s1.charAt(0);
        //unicode value of A = 65
        //unicode value of E = 69
        //unicode value of I = 73
        //unicode value of O = 79
        //unicode value of U = 85
        if(ch1==65 || ch1==69 || ch1==73 || ch1==79 || ch1==85)
        {
            System.out.println("Vowel");
        }else
        {
            System.out.println("Not a Vowel");
        }

    }    
}
