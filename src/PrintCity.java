import java.util.Scanner;

public class PrintCity
{
    public void findCity()//nonstatic method
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the Any Alphabet From A to F:-");
        char city =data.next().charAt(0);
        if(city=='a')

        {
            System.out.println("You Choose Ahmedabad");
        }
        else if(city=='b')
        {
            System.out.println("You Choose Baroda");
        }
        else if(city=='c')
        {
            System.out.println("You Choose Chennai");
        }
        else if(city=='d')
        {
            System.out.println("You choose Darjeeling");
        }
        else if(city=='e')
        {
            System.out.println("You Choose idar");
        }
        else if(city=='f')
        {
            System.out.println("You Choose Faridabad");
        }
        else
        {
            System.out.println("Sorry  You Enter Invalid Entry");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("---PRINT CITY NAME ACCORDING TO GIVE ALPHABET---");
        PrintCity printCity=new PrintCity();
        printCity.findCity();//call nonstatic method
    }
}
