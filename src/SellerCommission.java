import java.util.Scanner;

public class SellerCommission //find commission
{
    
    
    public static void findCommission() //create static method
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the Name of Seller's:-");
        String name_emp= data.nextLine();

        System.out.println("Enter The Id Of Seller's:-");
        int id= data.nextInt();

        System.out.println("Enter The Basic Salary:-");
        int basic_sal= data.nextInt();
        System.out.println("Enter The Sales Amount:-");
        int amount= data.nextInt();
        int commission;
        if(amount>=50000)
        {
            commission=amount*35/100;
            System.out.println("Your Commission Is :-"+commission);
        }
        else if(amount>=30000)
        {
            commission=amount*20/100;
            System.out.println("Your Commission Is :-"+commission);

        }
        else if(amount>=20000)
        {
            commission=amount*10/100;
            System.out.println("Your Commission Is :-"+commission);

        }
        else if(amount>=10000)
        {
            commission=amount*5/100;
            System.out.println("Your Commission Is :-"+commission);

        }
        else
        {
            commission=amount*2/100;
            System.out.println("Your Commission Is :-"+commission);


        }

    }
    
    
    public static void main(String [] args)
    {
        System.out.println("------FIND COMMISSION OF SELLERS--------");
        findCommission();//call the static method
    }

}
