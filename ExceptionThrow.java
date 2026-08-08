import java.util.Scanner;
public class ExceptionThrow 
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
    try
   
    { 
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
    catch(ArithmeticException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
        System.out.println("Program end");
    }

     

     
    }
    
} 
