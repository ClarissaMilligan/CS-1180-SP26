import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // try{

        //     Scanner scnr = new Scanner(new File("LoremIpsum.txt"));

        //     while(scnr.hasNext()){
        //         System.out.println(scnr.next());
        //     }

        // } catch(FileNotFoundException fnfe){
        //     System.out.println("Could not find file!");
        // }

        try {

            System.out.println("LI contains Lorem: " + search("LoremIpsum.txt", "Lorem"));
            System.out.println("foo contains bar: " + search("foo.txt", "bar"));
            System.out.println("foo contains Lorem: " + search("foo.txt", "Lorem"));


        } catch (FileNotFoundException fnfe){
            System.out.println("Search could not run due to missing file");

            fnfe.printStackTrace();
        }

        copyToUppercase("foo.txt", "NEW_FOO.txt");
        // copyToUppercase("oldFile.txt", "newFile.txt");

    }

    public static void copyToUppercase(String oldFile, String newFileName){
        File old = new File(oldFile);


        try{

            Scanner scnr = new Scanner(old);

            FileWriter copyWriter = new FileWriter(newFileName, true);
            PrintWriter pw = new PrintWriter(copyWriter);

            while(scnr.hasNext()){
                String cur = scnr.next();

                pw.println(cur.toUpperCase());

            }

            pw.close();
            copyWriter.close();


        } catch (FileNotFoundException fnfe){
            System.out.println("Could not find the file");
        }
        catch (IOException ioe){
            System.out.println("oopsies something went wrong");
        }

    }



    public static boolean search(String fileName, String findMe) throws FileNotFoundException{

        File f = new File(fileName);

        Scanner scnr = new Scanner(f);

        boolean hasFoundWord = false;

        while(scnr.hasNext()){
            String cur = scnr.next();

            if(cur.equals(findMe)){
                hasFoundWord = true;
            }

            // System.out.println(cur);
        }

        return hasFoundWord;
    }

    //
}