import java.util.Scanner;
public class ExceptionThrowandThrows 
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the age of the person");
     int age=sc.nextInt();
     if(age<18)
     {
        throw new ArithmeticException("Not Eligible For Vote");
     }
     else
     {
        System.out.println("Eligible For Vote");
     }
    }
    
}
