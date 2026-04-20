import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ObjectsIntro
{
    public static void main(String[] args)
    {
        System.out.println("PIXEL COUNT: " + Pixel.getPixelCount());
        Pixel p1 = new Pixel(33, 89, "blue");
        System.out.println("PIXEL COUNT: " + p1.getPixelCount());
        Pixel p2 = new Pixel();
        System.out.println("PIXEL COUNT: " + p2.getPixelCount());

        p1.pixelInfo();
        p2.pixelInfo();

//        System.out.println(p1.x);
//        p1.x = 72;
//        System.out.println(p1.x);
//        p1.x = -42387;
//        System.out.println(p1.x);

        System.out.println(p1.getX());
        p1.setX(72);
        System.out.println(p1.getX());
        p1.setX(-42387);
        System.out.println(p1.getX());

        System.out.println(p1.setY(-40));
        System.out.println(p1.getY());

        p1.setColor("PURPLE");
        System.out.println(p1.getColor());

        Pixel p3 = new Pixel(45, 900, "cyAN");
        p3.pixelInfo();

        p3 = new Pixel();
        System.out.println("PIXEL COUNT: " + Pixel.getPixelCount());

        // ***************************
        // INHERITANCE PRACTICE STARTS
        // ***************************

        System.out.println("\n----------\nSTART INHERITANCE PRACTICE\n----------\n");

        TouchscreenPixel tp1 = new TouchscreenPixel();
        System.out.println(tp1.getX());
        tp1.setX(32);
        tp1.setColor("blue");
        tp1.setY(179);
        tp1.pixelInfo();

        TouchscreenPixel tp2 = new TouchscreenPixel(true, 55);
//        Scanner scnr = new Scanner(System.in);
//        ArrayList<Integer> ints = new ArrayList<>();

        System.out.println(tp2);


        // EXCEPTION PRACTICE

        Scanner scnr = new Scanner(System.in);
        System.out.println("give x value: ");
        int x = 0;

        boolean badInput = true;

        while (badInput)
        {
            try
            {
                x = scnr.nextInt();
                Pixel userPixel = new Pixel(x, 87, "blue");
                badInput = false;
            }
            catch (PixelIndexOutOfBounds pioob)
            {
                System.out.println(pioob.getMessage());
                System.out.println("Try again!");
                scnr.nextLine();
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Must input an integer!!!");
                scnr.nextLine();
            }
        }


        // POLYMORPHISM PRACTICE

        ArrayList<Pixel> pixels = new ArrayList<>();
        pixels.add(p1);
        pixels.add(p2);
        pixels.add(p3);
        pixels.add(tp1);
        pixels.add(tp2);

        System.out.println("\n\nPOLYMORPHISM\n----------");
        for (Pixel p : pixels)
        {
            p.pixelInfo();

            if (p instanceof TouchscreenPixel)
            {
                System.out.println(((TouchscreenPixel) p).isClicked());
            }
        }

    }
}
