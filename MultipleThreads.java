class Thread1 extends Thread
{  public void run()
    {
    for(int i=1;i<=5;i++)
    {
        System.out.println(i);
    }
    try{
        Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
  }
}
class Thread2 implements Runnable
{  public void run()
    
    {
        for(int i=6;i<=10;i++)
    {
        System.out.println(i);
    }
    try{
        Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
}
}
class Thread3 implements Runnable
{  public void run()
    {
    for(int i=11;i<=15;i++)
    {
        System.out.println(i);
    }
    try{
        Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
}
}

public class MultipleThreads 
{
    public static void main(String[] args)
    {
     Thread1 ob1=new Thread1();
     ob1.start();
     Thread2 ob2=new Thread2();
     Thread ob22=new Thread(ob2);
     ob22.start();
     Thread3 ob3=new Thread3();
     Thread ob33=new Thread(ob3);
     ob33.start();
     

    }
}
