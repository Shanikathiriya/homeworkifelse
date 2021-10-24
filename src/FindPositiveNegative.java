import java.util.Scanner;

public class FindPositiveNegative { //find given number is positive negative or zero

    public static void checkNumber(int a) //create static method with argument
    {
        if(a>0)
        {
            System.out.println("Number is Positive");
        }
        else if(a<0)
        {
            System.out.println("Number Is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
    public static void main(String [] args)
    {
        System.out.println("----FIND GIVEN NUMBER POSITIVE OR NEGATIVE OR ZERO----");
        Scanner data=new Scanner(System.in);

        System.out.println("Enter Any Number:-");
        int a= data.nextInt();
        checkNumber(a);// call the static method and pass the value in parameters as argument

    }

}
