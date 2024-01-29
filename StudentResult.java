import java.util.*;
class Student
{
    int sno;
    String sname,grade="No Grade",result="No Result";
    float c,cpp,java,python,oracle,totalMarks,avgMarks,passMarks;
    //parameterized constructor
    Student(int sno,String sname)
    {   this.sno=sno;
        this.sname=sname;
    }
    //instance method
    void setMarks(float c,float cpp,float java,float python,float oracle)
    {
        this.c=c;
        this.cpp=cpp;
        this.java=java;
        this.python=python;
        this.oracle=oracle;
        this.totalMarks=c+cpp+java+python+oracle;
        this.avgMarks=this.totalMarks/5;
    }
    void setPassmark(int passMarks)
    {
        this.passMarks=passMarks;
    }
    void displayResult()
    {
        //logical and (&&) operator
        if(c>=passMarks && cpp>=passMarks && java>=passMarks && python>=passMarks && oracle>=passMarks)
        {
            result="Pass";
            if(avgMarks>=90)
            {
                grade="A+";
            }else if(avgMarks>=80)
            {
                grade="A";
            }else if(avgMarks>=70)
            {
                grade="B+";
            }else if(avgMarks>=60)
            {
                grade="B";
            }else if(avgMarks>=50)
            {
                grade="C+";
            }else if(avgMarks>=40)
            {
                grade="C";
            }
        }else{
            result="Fail";
        }
        System.out.printf("Student With Reg.No:  %d Result\n",sno);
        System.out.printf("Name:\t%s\n",sname);
        System.out.printf("C:\t%.2f\n",c);
        System.out.printf("Cpp:\t%.2f\n",cpp);
        System.out.printf("Java:\t%.2f\n",java);
        System.out.printf("Python:\t%.2f\n",python);
        System.out.printf("Oracle:\t%.2f\n",oracle);       
        System.out.printf("TotalMarks:\t%.2f\n",totalMarks);       
        System.out.printf("Avg Marks:\t%.2f\n",avgMarks);       
        System.out.printf("Result:\t%s\n",result);       
        System.out.printf("Grade:\t%s\n",grade);       
    }
}
class StudentResult
{
    public static void main(String[] args) 
    {   
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter sno and sname\n");
        int sno=scan.nextInt();
        String sname=scan.next();
        Student s1=new Student(sno, sname);
        System.out.printf("Enter c marks:\t\n");
        float c=scan.nextFloat();
        System.out.printf("Enter cpp marks:\t\n");
        float cpp=scan.nextFloat();
        System.out.printf("Enter java marks:\t\n");
        float java=scan.nextFloat();

        System.out.printf("Enter python marks:\t\n");
        float python=scan.nextFloat();

        System.out.printf("Enter oracle marks:\t\n");
        float oracle=scan.nextFloat();

        s1.setMarks(99, 89, 100, 98, 99);
        s1.setPassmark(40);
        s1.displayResult();

    }
}