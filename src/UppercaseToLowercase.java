import java.util.Scanner;

public class UppercaseToLowercase {   //CONVERT UPPERCASE TO LOWERCASE


    public void CovertTOLower()  //CREATE NONSTATIC METHOD WITHOUT ARGUMENT
    {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the Any alphabet in Uppercase");
        char char1 =data.next().charAt(0);

        int ascii=char1;
        ascii=ascii-32;
        char1=(char) ascii;

        System.out.println("Convert in Lowercase:- "+char1);




    }

    public static void main(String [] args)
    {

        UppercaseToLowercase uppercaseToLowercase=new UppercaseToLowercase();

        uppercaseToLowercase.CovertTOLower();//CALL THE METHOD BY USING CLASS OBJECT


    }
}
