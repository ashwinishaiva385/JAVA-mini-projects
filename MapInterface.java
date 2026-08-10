import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class MapInterface
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        Map<Integer,String>employee=new HashMap<>();
        employee.put(101,"Ashwini");
        employee.put(102,"Ash");
        employee.put(103,"Rahul");
        employee.put(104,"Ravi");
        employee.put(105,"Anu");
        System.out.print("Enter Employee id to fetch the Employee name : ");
        int id=sc.nextInt();
        System.out.println(employee.get(id));
        for(Map.Entry<Integer,String>entry:employee.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
         System.out.print("Enter Employee id to Remove : ");
         int Remove_id=sc.nextInt();
         employee.remove(Remove_id);
         System.out.println(employee.containsKey(Remove_id));
    

    }
}