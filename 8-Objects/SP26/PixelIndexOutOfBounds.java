public class PixelIndexOutOfBounds extends Exception
{
    public PixelIndexOutOfBounds(int wrongValue)
    {
        super(wrongValue + " is not a valid pixel index!");
    }
}
