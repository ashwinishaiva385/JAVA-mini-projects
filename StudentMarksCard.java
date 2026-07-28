import java.util.Scanner;
public class StudentMarksCard 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Student name");
       String name=sc.nextLine();
       int marks[]=new int[5];
       for(int i=0;i<marks.length;i++)
       {
        System.out.println("Enter the Student subject"+(i+1)+ " marks");
        marks[i]=sc.nextInt();
       }
       int total=0;
       for(int i=0;i<marks.length;i++)
       {
        total+=marks[i];
       }
       int avg=(total)/marks.length;
        for(int i=0;i<marks.length;i++)
       {
         if(marks[i]>=90)
            System.out.println("GRADE : A+");
        else if(marks[i]>=80)
            System.out.println("GRADE : A");
        else if(marks[i]>=70)
            System.out.println("GRADE : B+");
        else if(marks[i]>=60)
            System.out.println("GRADE : B");
        else if(marks[i]>=50)
            System.out.println("GRADE : c+");
        else if(marks[i]>=35)
            System.out.println("GRADE : c");
        else
            System.out.println("GRADE : F");

        }
        System.out.println("Total marks : "+ total);
        System.out.println("Percentage : "+avg+"%");
         boolean pass=true;
        for(int i=0;i<marks.length;i++)
       {
         if(marks[i]<35)
         {
             pass=false;
            break;
         }
           
        }
        if(pass)
        {
            System.out.println("RESULT : PASS");

        }
        else
        System.out.println("RESULT : FAIL");
        

    }
}
