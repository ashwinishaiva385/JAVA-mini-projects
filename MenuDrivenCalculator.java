import java.util.Scanner;
public class MenuDrivenCalculator 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String operator;
       int a,b;
       System.out.println("Enter the Two operands");
       a=sc.nextInt();
       b=sc.nextInt();
       int res;
       System.out.println("Enter the  operator");
       operator=sc.next();
       switch (operator) {
        case "+":res=a+b;
                 System.out.println("Sum : "+res);
                 break;
        case "-":res=a-b;
                 System.out.println("Difference : "+res);
                 break;
        case "*":res=a*b;
                 System.out.println("Multiplication : "+res);
                 break;
        case "/":if(b!=0)
                {
                    res=a/b;
                 System.out.println("Division : "+res);
                }
                 else
                 System.out.println("Not posible");
                 break;
        case "%":res=a%b;
                 System.out.println("Modulus : "+res);
                 break;
       
        default:System.out.println("Invalid operator");
            break;
       }

    }
}
