public class TouchscreenPixel extends Pixel
{
    private boolean isClicked = false;
    private int totalClickCount = 0;

    public TouchscreenPixel()
    {

    }

    public TouchscreenPixel(boolean isClicked, int totalClickCount, int x, int y, String color)
    {
        super(x, y, color);
        setClicked(isClicked);
        setTotalClickCount(totalClickCount);
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
