package Assignment;

public class NumbersDemo {

    public static void main(String[] args)
    {
     int x = 5;
     int y = 10;
     displayTwiceTheNumber(x,y);
     displayNumberPlusFive(x,y);
     displayNumberSquared(x,y);


    }
    public static void displayTwiceTheNumber(int x, int y)
    {
        int x2;
        int y2;

        x2 = x * 2;
        y2 = y * 2;

        pl(x2 + " " + y2);

    }
    public static void displayNumberPlusFive(int x, int y)
    {
        int x5;
        int y5;

        x5 = x + 5;
        y5 = y + 5;

        pl(x5 + " " + y5);
    }
    public static void displayNumberSquared(int x, int y)
    {
     int xs;
     int ys;

     xs = x * x;
     ys = y * y;

     pl(xs + " " + ys);

    }
    public static void  pl(String p)
    {
        System.out.println(p);
    }
}
