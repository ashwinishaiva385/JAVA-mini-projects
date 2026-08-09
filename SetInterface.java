import java.util.HashSet;
import java.util.Scanner;
public class SetInterface 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<String>student=new HashSet<>();
        int choice;
        while(true)
        {
        System.out.println("===== Student Registration =====");
        System.out.println("Enter your choice\n1.Add Students\n2.Display Students\n3.Search Student\n4.Remove Student\n5.Count Student\n6.Exit");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter student names : ");
                    for(int i=0;i<6;i++)
                    {
                       String names=sc.nextLine();
                       student.add(names);
                    }
                    break;
            case 2:System.out.println("Registered Students : "+student);
                   break;

            case 3:System.out.println("Is Shena registered : "+student.contains("Sneha"));
                   break;
            case 4:System.out.println("Removing Ashwini "+student.remove("Ashwini"));
                   break;
            case 5:System.out.println("The number of students : "+student.size());
                   break;
            default:System.out.println("Invalid Choice");            
        }     
    
    }


        
        

    }
}
