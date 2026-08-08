import java.util.Scanner;
public class ExceptionThrowsKeyword 
{ static void checkMarks(int marks) throws Exception
    {
        if(marks<35)
        {
            throw new ArithmeticException("Failed");
        }
        else 
            System.out.println("Passed");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks of the student");
        int marks=sc.nextInt();
        try
        {
      checkMarks(marks);

        }
        catch (Exception e)
        {
         System.out.println("Something is wrong\n"+e.getMessage());
        }
        finally
        {
            System.out.println("Program Ended");
        }
    }
    
}
