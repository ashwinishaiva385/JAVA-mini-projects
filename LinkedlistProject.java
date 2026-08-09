import java.util.LinkedList;
public class LinkedlistProject 
{
    public static void main(String[] args)
    {
     LinkedList<String>fruits=new LinkedList<>();
     fruits.add("Mango");
     fruits.add("Apple");
     fruits.add("Papaya");
     fruits.add("Banana");
     fruits.add("Jack fruits");
     System.out.println(fruits);
     System.out.println(fruits.get(0));
     fruits.set(2,"Gauva");
     fruits.removeLast();
     System.out.println("The updated List is : "+fruits);
    }
    
}
