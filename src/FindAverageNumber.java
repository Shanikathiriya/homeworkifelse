import java.util.Scanner;

public class FindAverageNumber {  //find average of five number

    public static void average()  //create static method without argument
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The First Number");
        int num1=scanner.nextInt();

        System.out.println("Enter The Second Number");
        int num2=scanner.nextInt();

        System.out.println("Enter The Third Number");
        int num3=scanner.nextInt();

        System.out.println("Enter The Forth Number");
        int num4=scanner.nextInt();

        System.out.println("Enter The Fifth Number");
        int num5=scanner.nextInt();

        int total=num1+num2+num3+num4+num5;  //find total and calculate average
        int average=total/5;

        System.out.println("The Average of Five Number Is:-"+average);

    }

    public static void main(String [] args)
    {

        System.out.println("---------FIND AVERAGE OF FIVE NUMBER--------");
        average();//call the method
    }
}
