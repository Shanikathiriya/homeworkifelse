import java.util.Scanner;

public class PersonAge
{
    public static void checkAge() // static method without argument
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter The Your Age:-");
        int age= data.nextInt();

        if(age>=18)
        {
            System.out.println("You are Eligible For Vote");
        }
        else
        {
            System.out.println("Sorry you are Not Eligible For vote ");
        }

    }

    public static void main(String [] args)
    {
        System.out.println("------Find  Eligible For vote or Not----- ");

        checkAge();//call method
    }
}
