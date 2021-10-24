import java.util.Scanner;

public class OperatorsExample //perform different operation
{
    public void calculate()
    {
        float ans;
        Scanner data=new Scanner(System.in);
        System.out.println("Enter First Number:-");
        float num1= data.nextFloat();
        System.out.println("Enter Second Number:-");
        float num2=data.nextFloat();

        System.out.println("Enter The Operators (*,+,/,-):-");
        char symbol=data.next().charAt(0);

        if(symbol == '+')
        {
            ans=num1+num2;
            System.out.println("Addition Is :=>"+ans);
        }
        else if(symbol =='-')
        {
                ans=num1-num2;
                System.out.println("Subtraction is:=>"+ans);
        }
        else if(symbol=='*')
        {
                ans=num1*num2;
                System.out.println("Multiplication Is:=>"+ans);
        }
        else if(symbol=='/')
        {
                ans=num1/num2;
                System.out.println("Division is;=>"+ans);
        }
        else
        {
            System.out.println("Sorry Invalid Entry");
        }

    }



    public static void main(String  [] args)
    {
        System.out.println("----PERFORM CALCULATION----");
        OperatorsExample operatorsExample=new OperatorsExample();
        operatorsExample.calculate();


    }

}
