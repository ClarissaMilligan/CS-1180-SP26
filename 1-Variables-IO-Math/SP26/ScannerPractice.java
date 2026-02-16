import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userName = scnr.nextLine();
        System.out.println("Your name is " + userName);

        System.out.println("Enter your age:");
        int userAge = scnr.nextInt();
        System.out.println("Your age is " + userAge);

        System.out.println("What is your favorite decimal number?");
        double decimalNumber = scnr.nextDouble();
        System.out.println("Your favorite number is " + decimalNumber + ".");

        scnr.nextLine(); // grabs the newline character off of the Scanner buffer

        System.out.println("What is your favorite dessert?");
        String dessert = scnr.nextLine();
        System.out.println("Your favorite dessert is " + dessert);
    }
}
