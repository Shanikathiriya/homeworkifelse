import java.util.Scanner;

public class VowelOrConsonant  //Find the given alphabet is vowel or consonant
{
    public void findVowel()  //nonstatic method without argument
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char alpha=data.next().charAt(0);

        if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u' || alpha=='A' || alpha=='E' || alpha=='I'|| alpha=='O'||alpha=='U')
        {
            System.out.println("This is Vowel...");
        }
        else
        {
            System.out.println("This is Consonant...");
        }

    }
    public static void main(String [] args)
    {
        System.out.println("---------FIND VOWEL OR CONSONANT----------");
        VowelOrConsonant vowelOrConsonant=new VowelOrConsonant(); //create object of class
        vowelOrConsonant.findVowel(); //call the nonstatic method by class object

    }
}
