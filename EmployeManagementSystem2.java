class Employee
{  int employeeId;
   String employeeName;
   double salary;
   void inputEmployeeDetials(int id,String name,double sal)
   {
    employeeId=id;
    employeeName=name;
    salary=sal;
   }
   void displayEmployeeDetails()
   {
    System.out.println("Employye ID : "+employeeId);
    System.out.println("Employye Name : "+employeeName);
    System.out.println("Employye Salary : "+salary);
   }
}
class Developer extends Employee
{ String proLang;
    void inputDeveloperDetails(String lang)
    {
        proLang=lang;
    }
    void displayDeveloperDetails()
   {
    System.out.println("Programming language : "+proLang);
   }

}
class Manager extends Developer
{
  int teamSize;
  void inputManagerDeatils(int size)
  {
    teamSize=size;
  }
  void displayManagerDetails()
   {
    System.out.println("Team Size : "+teamSize);
   }
}
public class EmployeManagementSystem2 
{
 public static void main(String[] args)
 {
    Manager ob=new Manager();
    ob.inputEmployeeDetials(123,"Ashwini",50000.0);
    ob.displayEmployeeDetails();
    ob.inputDeveloperDetails("Java");
    ob.displayDeveloperDetails();
    ob.inputManagerDeatils(8);
    ob.displayManagerDetails();
 }    
}
