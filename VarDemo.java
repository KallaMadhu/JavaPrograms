import java.lang.*;
/** 
VarDemo Class is user-defined class...
*/
public class VarDemo 
{

    /**it is the starting point of the program. we can't run java program without having main method... */
    public static void main(String[] args) 
    {
        int var=199;  //var is not behaving like a keyword
        System.out.println("var:\t"+var);    
        var a=100;  //var is behaving like a keyword
        var name="madhu";
        var ch1='+';
        var flag=true;
        var sal=10000.50f;
        var price=100.76;
        System.out.println("a:\t"+a);    
        System.out.println("Name:\t"+name);    
        System.out.println("ch1:\t"+ch1);    
        System.out.println("flag:\t"+flag);    
        System.out.println("sal:\t"+sal);    
        System.out.println("Price:\t"+price);    
    }
}
