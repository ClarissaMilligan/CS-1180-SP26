import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOIntro
{
    public static void main(String[] args) throws IOException
    {
        FileWriter appendToFile = new FileWriter("findWorkingDirectory.txt", true);
        PrintWriter writeToFile = new PrintWriter(appendToFile);
        writeToFile.println("I hope I feel better soon!");
        writeToFile.close();
        appendToFile.close();
    }
}
