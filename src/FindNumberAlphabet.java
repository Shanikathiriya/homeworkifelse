import java.util.Scanner;

public class FindNumberAlphabet  //find number or alphabet or symbol
{
    public static void findNumber()  //create static method without argument
    {
        Scanner data=new Scanner(System.in);  //taking input from user
        System.out.println("Enter the any Value :=>");
        char value=data.next().charAt(0);

        if(Character.isAlphabetic(value))
        {
            System.out.println("This Is Alphabet.....");
        }
        else if(Character.isDigit(value))
        {
            System.out.println("This is Digit......");
        }

        else
        {
            System.out.println("This is Special character....");
        }
    }

    public static void main(String [] args)
    {
        System.out.println("---FIND THE NUMBER ,ALPHABET OR SYMBOL----");
        findNumber();//call static method


    }
}
