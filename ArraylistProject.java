import java.util.ArrayList;
class ArraylistProject
{
    public static void main(String[] args)
    {
    ArrayList<String>student=new ArrayList<>();
    student.add("Ashwini A");
    student.add("Geetha S");
    student.add("Ankappa K B");
    student.add("Prasad");
    student.add("Shashi");
    System.out.println("The students name is : "+student);
    student.get(2);
    student.set(2,"Ankappa Basavarajappa");
    student.remove("Ashwini A");
    System.out.println("Updated List is : "+student);
    System.out.println("Total number of students : "+student.size());

    }
}