import java.util.*;
public class VowelOrNot3
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a character:\t");
        String s1=scan.next();  //s1="a"
        s1=s1.toUpperCase();   //s1="A"
        char ch1=s1.charAt(0);

        switch (ch1) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                    System.out.println("It is Vowel");
                    break;
            default:
                    System.out.println("It is Not A Vowel");
                    break;
        }
        

    }    
}
