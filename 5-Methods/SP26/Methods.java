import java.util.Random;

public class Methods {
    public static void main(String[] args) {
        int goodDeeds = 10;
        // class name, Methods, is not required because the method, isLucky,
        // is defined in the same class that it is called from
        System.out.println(Methods.isLucky(goodDeeds));
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
