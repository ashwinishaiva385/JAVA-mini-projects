class Storage<T>
{ 
    T data;
    void setData(T value)
    {
        data=value;
    }
    void display()
    {
        System.out.println(data);
    }
}
    public class Generics 
{
    public static void main(String[] args)
    {
       Storage<Integer>numbers=new Storage<>();
       numbers.setData(3);
       numbers.display();
       numbers.setData(4);
        numbers.display();
       numbers.setData(5);
        numbers.display();
       numbers.setData(7);
        numbers.display();
       numbers.setData(1);
        numbers.display();
      Storage<String>names=new Storage<>();
      names.setData("Ash");
      names.display();
      names.setData("Asha");
      names.display();
      names.setData("Ashwini");
      names.display();
      names.setData("Ashu");
      names.display();
      names.setData("Ashwi");
      names.display();
     
      
      
    }
}
