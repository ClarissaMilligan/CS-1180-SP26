public class TouchscreenPixel extends Pixel
{
    private boolean isClicked = false;
    private int totalClickCount = 0;

    public TouchscreenPixel()
    {
        System.out.println("Touchscreen pixel no-arg constructor was called");
    }

    public TouchscreenPixel(boolean isClicked, int totalClickCount)
    {
        this();
        setClicked(isClicked);
        setTotalClickCount(totalClickCount);
    }

    public TouchscreenPixel(boolean isClicked, int totalClickCount, int x, int y, String color) throws PixelIndexOutOfBounds
    {
        super(x, y, color);
        setClicked(isClicked);
        setTotalClickCount(totalClickCount);
    }

    public void pixelInfo()
    {
        super.pixelInfo();
        System.out.println(super.getColor() + " touchscreen pixel at x:" + getX() + " y:" + getY());
    }

    public boolean isClicked()
    {
        return isClicked;
    }

    public void setClicked(boolean clicked)
    {
        isClicked = clicked;
    }

    public int getTotalClickCount()
    {
        return totalClickCount;
    }

    public void setTotalClickCount(int totalClickCount)
    {
        if (totalClickCount >= 0)
        {
            this.totalClickCount = totalClickCount;
        }
    }
}
