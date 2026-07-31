class Bank
 {
   private int accountNumber;
   private String holderName;
   private double balance;
   void setter1(int accountNumber)
   {
    this.accountNumber=accountNumber;
   }
   void setter2(String holderName)
   {
    this.holderName=holderName;;
   }
   void setter3(double balance)
   { if(balance<0)
   {
    System.out.println("Invalid balance! bacmce cannot be negative.");
   }
   else
    this.balance=balance;
   }
   int getter1()
   {
    return accountNumber;
   }
   String getter2()
   {
    return holderName;
   }
   double getter3()
   { 
    return balance;
   }

}
    public class BankAccountSystem
{
    public static void main(String[] args)
    {
        Bank ob=new Bank();
        ob.setter1(234456677);
        ob.setter2("Ashwini");
        ob.setter3(-30);
       
        double res=ob.getter3();
         System.out.println("Account Number="+ob.getter1());
          System.out.println("Account Holder Name="+ ob.getter2());
    System.out.println("Balance Amount="+ob.getter3());


    }
}

