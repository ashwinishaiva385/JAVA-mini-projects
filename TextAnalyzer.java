import java.util.Scanner;
public class TextAnalyzer 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int vowels=0;
    int consonants=0;
    System.out.println("Enter the Text");
    String text=sc.nextLine();
    System.out.println("The original Text is : "+text);
    System.out.println("The length of the Text : "+text.length());
    System.out.println("UpperCase : "+text.toUpperCase());
    System.out.println("Lowercase : "+text.toLowerCase());
    String[] word=text.split(" ");
    System.out.println("The length of the word : "+word.length);
    for(int i=0;i<text.length();i++)
    {   char ch=text.charAt(i);
        if(ch=='a' | ch=='A' | ch=='e' | ch=='E' | ch=='i' | ch=='I' | ch=='o' | ch=='O' | ch=='u' | ch=='U')
        {
          vowels++;
        }
        else if(Character.isLetter(ch))
            consonants++;

    }
    System.out.println("The vowels count : "+vowels);
    System.out.println("The constant count : "+consonants);

    StringBuilder s=new StringBuilder(text);
    System.out.println("Reverse of the Text : "+s.reverse());

  }
    
}
