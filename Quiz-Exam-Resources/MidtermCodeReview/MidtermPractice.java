import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MidtermPractice
{
    public static void main(String[] args)
    {
        int countdown = 10; // #1
        while (countdown > 0) // #2
        {
            System.out.println(countdown); // #3
            countdown--; // #4
        }

                // #1                 #2             #4
        for (int countdown2 = 10; countdown2 > 0; countdown2--)
        {
            System.out.println(countdown2); // #3
        }





        Scanner scnr = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scnr.nextInt();
        int dividend = 6;
        boolean isDivisible = isDivisible(age, dividend);

        if (isDivisible)
        {
            System.out.println("Your age (" + age + ") is divisible by "+ dividend + "!");
        }

        for(int i = 1; i <= age; i++)
        {
            System.out.println(i);
        }


        System.out.println("type a letter");
        char letter = scnr.next().charAt(0);

        while (letter != 'a')
        {
            System.out.println("type another letter");
            letter = scnr.next().charAt(0);
        }

        System.out.println("type a letter");
        letter = scnr.next().charAt(0);

        for (; letter != 'a'; )
        {
            System.out.println("type another letter");
            letter = scnr.next().charAt(0);
        }
    }

    public static boolean isDivisible(double num, int dividend)
    {
        if (num % dividend == 0)
        {
            return true;
        }
        return false;
    }
}
