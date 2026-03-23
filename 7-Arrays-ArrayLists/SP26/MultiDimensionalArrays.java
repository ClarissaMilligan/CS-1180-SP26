import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // non-ragged array
        //String[][] classSections = new String[3][50];
        // ragged array
        String[][] classSections = { new String[34], new String[29], new String[52]};
        System.out.println(Arrays.toString(classSections));

        classSections[0][3] = "Bob";
        classSections[1][10] = "Charlie";
        classSections[2][7] = "Alice";

        for (String[] section : classSections)
        {
            System.out.println(Arrays.toString(section));
        }

        Object[][] stuff = { new Integer[3], new Scanner[2], new String[1] };
        stuff[0][0] = 5;
        stuff[0][1] = 3;
        stuff[0][2] = 7;
        stuff[1][0] = new Scanner(System.in);
        stuff[1][1] = new Scanner(new File("findWorkingDirectory.txt"));
        stuff[2][0] = "Clarissa";

        for (Object[] internalArray : stuff)
        {
            System.out.println(Arrays.toString(internalArray));
        }

        String allCapsName = ((String) stuff[2][0]).toUpperCase();
        System.out.println(allCapsName);

        // stuff[1][0].next();

    }
}
