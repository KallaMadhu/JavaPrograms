import java.util.*;
public class OvelOrNot 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter any character:\t");
        String s1=scan.next(); //s1="MADHU"
        s1=s1.toLowerCase();  //s1="madhu"
        char ch1=s1.charAt(0);
        //charAt() methods gets the character from a string existed at a specified index.
        //System.out.printf("ch1:\t%c",ch1);
        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
        {
            System.out.printf("%c is Vowel\n",ch1);
        }else
        {
            System.out.printf("%c is not a Vowel\n",ch1);
        }
    }    
}
