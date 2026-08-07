import java.util.Scanner;
class ExceptionHandlingUsimgMultipleCatch
{
  public static void main(String[] args)
  { 
    Scanner sc=new Scanner(System.in);
    int[] a={10,20,30};
    int x=10;
    int y=0;
    String s="123a";
    try
    {
     System.out.println("Enter the index of the array");
     int index=sc.nextInt();
     System.out.println("Element : "+a[index]);
     int ab=Integer.parseInt(s);
     int res=x/y;
    }
    catch(ArrayIndexOutOfBoundsException e )
    {
        System.out.println("Invalid index! please Enter valid index");
    }
    catch(ArithmeticException e )
    {
        System.out.println("Divided by zero not possible");
    }
     catch(NumberFormatException e )
    {
        System.out.println("Invalid number Formate");
    }
    finally
    {
     System.out.println("Program ended");
    }
  }
}