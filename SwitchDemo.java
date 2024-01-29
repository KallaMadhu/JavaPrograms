import java.util.Scanner;
public class SwitchDemo 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter color in capital letters:\t");
        String color=scan.next();
        switch(color)
        {
            case "RED":
                        System.out.println("Nuvvu mastu danger raa bhai");
                        //break;
            case "GREEN":
                        System.out.println("Greenary....");
                        //break;
            case "BLUE":
                        System.out.println("Cool....");
                        //break;
            default:
                        System.out.println("Invalid Color.....");
                        //break;
        }

    }    
}
