 import java.util.Scanner;
 abstract class  Shape
 {
   abstract void calculator();
   

 }
 class Circle extends Shape
 {  int radius;
  Circle(int rad)
  {
    radius=rad;
  }
    
   void calculator()
   {
    double area=3.14*radius*radius;
    System.out.println("Area of circle "+area);
   }
 }
 class Rectangle extends Shape
 
 { int length,breadth;
   Rectangle (int len,int brd )
  {
    length=len;
    breadth=brd;
  }
   @Override
   void calculator()
   {
    double area=length*breadth;
    System.out.println("Area of Rectangle = "+area);
   }
  
 }
 class Square extends Shape
 
 {  int s;
  Square(int s)
  {
    this.s=s;
  }
   @Override
   void calculator()
   {
    double area=4*s*s;
    System.out.println("Area of Square = "+area);
   }
 }
 
 
 public class AreaCalculator 
 {
    public static void main(String[] args)
    {  Scanner sc=new Scanner(System.in); 
      System.out.println("===== Area Calculator ====");
      int ch;
      System.out.println("Enter the choice\n 1.Circle\n2.Rectangle\n3.square\n");
       ch=sc.nextInt();
      switch(ch)
      {
        case 1: Circle ob1=new Circle(3);
                ob1.calculator();
                break;
        case 2: Rectangle ob2=new Rectangle(3,6);
                ob2.calculator();
                break;
        case 3: Square ob3=new Square(6);
                ob3.calculator();
                break;
        default : System.out.println("Invalid number");        
               
     
      }
     
    }
}
