import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int goodDeeds = 10;
        // class name, Methods, is not required because the method, isLucky,
        // is defined in the same class that it is called from
        System.out.println(Methods.isLucky(goodDeeds));

        requestInfo("name");
        String name = scnr.nextLine();
        requestInfo("age");
        int age = scnr.nextInt();
        requestInfo("favorite color");
        String color = scnr.next();

        System.out.println("Hi " + name + "! You are " + age + " years old and your favorite color is " + color);
    }

    public static void requestInfo(String info) {
        System.out.println("--------------------------------");
        System.out.println("Please enter your " + info + ": ");
        System.out.println("--------------------------------");
        System.out.println();
    }

    public static boolean isLucky(int numGoodDeeds) {
        Random rng = new Random();
        int randomInt = rng.nextInt(11);
        int luckValue = numGoodDeeds * randomInt;

        if (luckValue > 50) {
            return true;
        }
        return false;
    }
}
