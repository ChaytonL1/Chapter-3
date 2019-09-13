package Assignment;

import java.util.Scanner;

public class PoundsConversion {

    public static void main(String[] args)
    {
        int pounds;
        Scanner input = new Scanner(System.in);
        System.out.println(" Pounds Converted >> ");;
        pounds = input.nextInt();
        ouncesConversion(pounds);
        kilometersConversion(pounds);
        milligramsConversion(pounds);

    }
    public static void ouncesConversion(int pounds)
    {
        int ounces = pounds * 16;
        System.out.println(" Ounces = " + ounces);
    }
    public static void kilometersConversion(int pounds)
    {
        double kilograms = pounds * .453592;
        System.out.println(" Kilograms = " + kilograms);
    }
    public static void milligramsConversion(int pounds)
    {
     int milligrams = pounds * 453592;
        System.out.println(" Milligrams = " + milligrams);

    }
}
