import java.util.*;

public class Pixel
{
    private int x = 0;
    private int y = 0;
    private String color = "";

    private int maxX = 1920;
    private int maxY = 1080;
    private ArrayList<String> validColors = new ArrayList<>(Arrays.asList("red", "orange", "yellow", "green", "blue", "purple", "pink", "black", "white", "gray", "brown"));

    public Pixel()
    {
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
        setColor(color);
    }

    public void pixelInfo()
    {
        System.out.println(color + " pixel at x:" + x + " y:" + y);
    }

    public int getX()
    {
        return x;
    }

    public void setX(int newX)
    {
        if (newX >= 0 && newX <= maxX)
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
        if (newY >= 0 && newY <= maxY)
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
        if (validColors.contains(color))
        {
            this.color = color;
        }

    }

    public int getMaxX()
    {
        return maxX;
    }

    public int getMaxY()
    {
        return maxY;
    }
}
