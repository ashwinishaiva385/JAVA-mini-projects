import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
   InsufficientBalanceException(String msg)
   {
    super(msg);
   }
   static void withdraw(double balance,double amt) throws InsufficientBalanceException
   {
     if(amt>balance)
     {
      throw new InsufficientBalanceException("Insufficient Balance!");
     }
     else 
     {
        System.out.println("Withdrawal Successfull");
        System.out.println("Remaining balance : "+(balance-amt));
     }

   }
   
}
    
    
public class CustomException 
{
    public static void main(String[] args)
    {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter withdrawal amount : ");
    double amt=sc.nextInt();
   try{
   InsufficientBalanceException.withdraw(10000.0,amt);
   }
   catch(Exception e)
   {
    System.out.println(e.getMessage());
   }
   }
}
