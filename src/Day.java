import java.util.Scanner;

public class Day
{

    public static void dayPrint()
    {
        Scanner data=new Scanner(System.in);

        System.out.println("Enter the Number Between 1-7");
        int day= data.nextInt();

        if(day==1)
        {
            System.out.println("Hello...Monday");
        }
        else if(day==2)
        {
            System.out.println("Hello ....Tuesday");
        }
        else if(day==3)
        {
            System.out.println("Hello....Wednesday");
        }
        else if(day==4)
        {
            System.out.println("Hello.....Thursday");
        }
        else if(day==5)
        {
            System.out.println("Hello......Friday");
        }
        else if(day==6)
        {
            System.out.println("Hello....Saturday");

        }
        else if(day==7)
        {
            System.out.println("Hello.....Sunday");
        }
        else
        {
            System.out.println("Sorry invalid input....");
        }
    }
    public static void main(String [] args)
    {
        System.out.println("----PRINT THE DAYS----");
        dayPrint();

    }
}
