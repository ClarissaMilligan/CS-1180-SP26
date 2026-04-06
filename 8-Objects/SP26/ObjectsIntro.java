public class ObjectsIntro
{
    public static void main(String[] args)
    {
        Pixel p1 = new Pixel(33, 89, "blue");
        Pixel p2 = new Pixel();

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

        Pixel p3 = new Pixel(-45, 90000, "cyAN");
        p3.pixelInfo();

        p3 = new Pixel();
    }
}
