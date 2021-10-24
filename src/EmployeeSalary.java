import java.util.Scanner;

public class EmployeeSalary  //Find Gross Salary
   {

    public void grossSalary()   //create  Nonstatic method
    {
        Scanner data=new Scanner(System.in);  //take the input from user using scanner
        System.out.println("Enter the Name of Employee:-");
        String name_emp= data.nextLine();

        System.out.println("Enter The Id Of Employee:-");
        int id= data.nextInt();

        System.out.println("Enter The Basic Salary:-");
        int basic_sal= data.nextInt();

        int hra=(10*basic_sal)/100;
        int ta=(9*basic_sal)/100;
        int da=(8*basic_sal)/100;
        int pf=(20*basic_sal)/100;

        int gross_sal=(hra+ta+da-pf);               //calculate gross salary

        System.out.println("The Gross Salary of is:-"+gross_sal);

    }

    public static void main(String [] args)
    {

        System.out.println("------FIND THE GROSS SALARY-----");
        EmployeeSalary employeeSalary=new EmployeeSalary();
        employeeSalary.grossSalary();//call the method using class object
    }
}
