import java.util.Scanner;

public class StudentResult {  // FIND STUDENT RESULT

    public static void studentGrade(int m1,int m2,int m3)//STATIC METHOD WITH ARGUMENT

    {
        int total=m1+m2+m3;
        float per=(total*100)/300;
        System.out.println("The total Of Marks is:-"+total);
        System.out.println("The Percentage is:-"+per+"%");

        if(per>=80)
        {
            System.out.println("Your Grade is A+");

        }
        else if(per>=60)
        {
            System.out.println("Your Grade is A");
        }

        else if(per>=50)
        {
            System.out.println("Your Grade is B");
        }

        else if(per>=35)
        {
            System.out.println("Your Grade is C");
        }
        else
        {
            System.out.println("Sorry You Are Failed !");
        }


    }

    public static void main(String [] args)
    {
        System.out.println("------FIND STUDENT RESULT---- ");

        Scanner data=new Scanner(System.in);
        System.out.println("Enter the Name Of Student:-");
        String name=data.nextLine();

        System.out.println("Enter the RollNumber Of Student:-");
        int roll= data.nextInt();

        System.out.println("Enter The Marks For Java:-");
        int m1= data.nextInt();

        System.out.println("Enter The Marks For NetWorking:-");
        int m2= data.nextInt();

        System.out.println("Enter The Marks For Oracle:-");
        int m3= data.nextInt();

        studentGrade(m1,m2,m3);


    }
}
