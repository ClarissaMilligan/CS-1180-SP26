public class OverflowIntDivision
{
    public static void main(String[] args)
    {
        // OVERFLOW EXAMPLE
        int big = 2147483647;
        System.out.println(big);
        big = big * 3;
        System.out.println(big);

        byte small = 127;
        System.out.println(small);
        small = (byte) (small + 1);
        System.out.println(small);

        // INTEGER DIVISION EXAMPLE
        double answer = 10 / (double) 3;
        System.out.println(answer);

        // requires a type cast
        // because info will be lost
        // no automatic type conversion
        int value = (int) 3.1415926; // cause truncation after the period and lose all of our decimal info
        System.out.println(value);

        // no type cast required even though 3 is interpreted as an integer
        // because no information will be lost
        // automatic type conversion
        double decVal = 3;
        System.out.println(decVal);
    }
}
