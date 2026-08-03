class Employee
{
    String name;
    double salary;
    Employee(String na,double sal)
    {
        name=na;
        salary=sal;
        System.out.println("Employee created");

    }
    void display()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("Salary : "+salary);

    }
}
class Developer extends Employee
{
    String language;
    Developer(String name,double salary,String lang)
    {  super(name,salary);
        language=lang;
    }
    void display()
    {   super.display();
        System.out.println("programming language : "+ language);
    }


}
public class EmployeeUsingSuperKeyword 
{ 
    public static void main(String[] args)
    {
     Developer ob=new Developer("Ashwini",3000.0,"Java");
      ob.display();


    }
    
}
