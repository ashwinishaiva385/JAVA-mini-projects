import java.util.Scanner;
 class Employee
{ 
  String name;
  int id;
  double salary;
  String dep;
   void input(int id,String name,String dep,double sal)
  { this.name=name;
    this.id=id;
    this.dep=dep;
    this.salary=sal;
  }
  void display()
  {
    System.out.println("EmployeID : "+id+" NMAE : "+name+" Department : "+dep+" salary :"+salary);
  }
}

public class EmployeManagementSystem
{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
       Employee[] ob=new Employee[5];
       for(int i=0;i<ob.length;i++)
       {  ob[i]=new Employee();
          System.out.println("Enter the employe"+(i+1)+" ID");
          int id=sc.nextInt();
        System.out.println("Enter the employe"+(i+1)+" name");
          String name=sc.next();
          System.out.println("Enter the employe"+(i+1)+" Department");
          String dep=sc.next();
          System.out.println("Enetr employe "+(i+1)+" Saalry");
          double salary=sc.nextDouble();
        ob[i].input(id,name,dep,salary);
       }
       for(int i=0;i<ob.length;i++)
       {
        ob[i].display();
       }
  

    
    }
}

