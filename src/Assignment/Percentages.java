package Assignment;

public class Percentages {

    public static void main(String[] args)
    {
        double a = 6;
        double b = 10;
        computePercentage(a,b);

    }
    public static void computePercentage(double a, double b)
    {
        double c;

        c = a / b * 100;

        System.out.println(a + " " + b);
        System.out.println(c + "%");

    }
}
