class Employee

{   
    static int count=0;
    Employee()
    {
        count++;
    }
} 
public class EmployeeCounter 
{
    public static void main(String[] args)
    {  
      Employee[] ob=new Employee[5];
      for(int i=0;i<ob.length;i++)
      {  ob[i]=new Employee();

      }
      System.out.println("The total number of employees : "+Employee.count);

    }
}
