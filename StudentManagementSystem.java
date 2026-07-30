import java.util.Scanner;
public class StudentManagementSystem 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[2];
        String name[]=new String[2];
        String usn[]=new String[2];
        int age[]=new int[2];
        int marks[]=new int[2];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter student"+(i+1)+" name");
             name[i]=sc.next();
            System.out.println("Enter student"+(i+1)+" USN");
             usn[i]=sc.next();
            System.out.println("Enter student"+(i+1)+" age");
             age[i]=sc.nextInt();
             System.out.println("Enter student"+(i+1)+" marks");
             marks[i]=sc.nextInt();


        }
        System.out.println("Student management system");
        System.out.println("------------------------");
        System.out.println("USN  NAME  AGE  Marks");
        System.out.println("------------------------");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(usn[i]+" "+name[i]+" "+age[i]+" "+marks[i]+"\n");
        }
        System.out.println("Enter usn to be change");
        String c_usn=sc.next();
        boolean found=false;
        for(int i=0;i<a.length;i++)
        {
            if(c_usn.equals(usn[i]))
            {
                System.out.println("Enter the marks to be update");
                int c_marks=sc.nextInt();
                marks[i]=c_marks;
                found=true;
            }
            
        }
        if(!found)
        {
            System.out.println("Not found");
        }
        System.out.println("Updates marks record");
        System.out.println("Student management system");
        System.out.println("------------------------");
        System.out.println("USN  NAME  AGE  Marks");
        System.out.println("------------------------");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(usn[i]+" "+name[i]+" "+age[i]+" "+marks[i]+"\n");
        }
        
    }
}

