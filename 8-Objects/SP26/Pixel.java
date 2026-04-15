import java.util.*;

public class Pixel
{
    static int pixelCount = 0;

    private int x = 0;
    private int y = 0;
    private String color = "";

    final private int MAX_X = 1920;
    final private int MAX_Y = 1080;
    final private ArrayList<String> VALID_COLORS = new ArrayList<>(Arrays.asList("red", "orange", "yellow", "green", "blue", "purple", "pink", "black", "white", "gray", "brown"));

    public Pixel()
    {
        pixelCount++;
//        x = 0;
//        y = 0;
//        color = "";
    }

    public Pixel(int x, int y, String newPixelColor)
    {
//        this.x = x;
//        this.y = y;
//        color = newPixelColor;
        // TODO: make this throw custom exceptions if values out of bounds
        setX(x);
        setY(y);
        setColor(newPixelColor);
        pixelCount++;
    }

    public static int getPixelCount()
    {
        return pixelCount;
    }

    public void pixelInfo()
    {
        System.out.println(color + " pixel at x:" + x + " y:" + y);
    }

    public String toString()
    {
        return "Pixel (" + color + ") located at (" + x + ", " + y + ")";
    }

    public int getX()
    {
        return x;
    }

    public void setX(int newX)
    {
        if (newX >= 0 && newX <= MAX_X)
        {
            x = newX;
        }
    }

    public int getY()
    {
        return y;
    }

    public boolean setY(int newY)
    {
        if (newY >= 0 && newY <= MAX_Y)
        {
            y = newY;
            return true;
        }
        return false;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        color = color.toLowerCase();
        if (VALID_COLORS.contains(color))
        {
            this.color = color;
        }

    }

    public int getMaxX()
    {
        return MAX_X;
    }

    public int getMaxY()
    {
        return MAX_Y;
    }
}
