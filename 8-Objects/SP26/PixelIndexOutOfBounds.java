public class PixelIndexOutOfBounds extends IndexOutOfBoundsException
{
    public PixelIndexOutOfBounds(int wrongValue, int MAX)
    {
        super(wrongValue + " is not a valid pixel index!\nValue must be >= 0 and <= " + MAX);
    }
}
