import java.util.Scanner;

public class SwapValue  //SWAP TWO VALUE
{
    public static void swap() // CREATE STATIC METHOD WITHOUT ARGUMENT
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter The Vale For A:-");
        int a= data.nextInt();
        System.out.println("Enter The Vale For B:-");
        int b= data.nextInt();
        int ans=b;
        b=a;
        a=ans;
        System.out.println("After Interchange \nValue of now A is:- "+a);

        System.out.println("Value of now B is:- "+b);


    }
    public static void main(String [] args)
    {
        System.out.println("------SWAP VALUE---- ");
        swap();// CALL THE METHOD
    }
}
