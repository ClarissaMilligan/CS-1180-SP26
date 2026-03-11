import java.io.*;
import java.util.Scanner;

public class FileIOIntro
{
    public static void main(String[] args)
    {
        // writing to a file
        try
        {
            FileWriter appendToFile = new FileWriter("findWorkingDirectory.txt", true);
            PrintWriter writeToFile = new PrintWriter(appendToFile);
            writeToFile.println("I hope I feel better soon!");
            writeToFile.close();
            appendToFile.close();
        }
        catch (IOException ioe)
        {
            System.out.println("can't print to file!");
        }

        boolean continueLooping = true;
        boolean dontSkip = true;

        Scanner consoleScanner = new Scanner(System.in);

        while(continueLooping)
        {
            System.out.println("Type in the file name that you want to read!");
            String fileName = consoleScanner.nextLine();

            // reading from a file
            File myFile = new File(fileName);

            try
            {
                Scanner fileScanner = new Scanner(myFile);
                if (dontSkip)
                {
                    System.out.println(10 / 0);
                }

                continueLooping = false;
                while (fileScanner.hasNextLine())
                {
                    System.out.println(fileScanner.nextLine());
                }
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("That's not a valid file name! Please try again!");
            }
            catch (Exception e)
            {
                System.out.println("There was a problem!");
                dontSkip = false;
            }
        }
    }
}
