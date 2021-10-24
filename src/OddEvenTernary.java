
import java.util.Scanner;

public class OddEvenTernary { //find number odd or even


    public static void oddEven(int a)  //static method with argument
    {

        String ans =(a%2==0)?"Given number is EVEN":"Given number is ODD";  //find odd or even using turn
        System.out.println(ans);


    }

    public static void main(String [] args)
    {

        System.out.println("----FIND NUMBER IS ODD OR EVEN-----");
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the Value:-");
        int a= data.nextInt();
        oddEven(a);// call the method and pass the value as argument
    }
}
