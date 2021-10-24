import java.util.Scanner;

public class LeapYear {  //find  year is leap year or not

    public  void checkLeapYear(int year) //nonstatic method with argument
    {
        if((year%4==0) &&(year%100!=0))
        {
            System.out.println("This is Leap Year");
        }
        else if((year%100==0)&&(year%400==0))
        {
            System.out.println("This is Leap Year");

        }
        else if(year%4==0)
        {
            System.out.println("This is Leap Year");

        }
        else
        {
            System.out.println("Given year is Not Leap Year");

        }
    }

    public static void main(String [] args)
    {

        System.out.println("----FIND YEAR IS LEAP YEAR OR NOT-----");
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the Year:-");
        int a= data.nextInt();

        LeapYear leapYear=new LeapYear();
        leapYear.checkLeapYear(a);     //call the method amd pass year value as argument
    }
}
