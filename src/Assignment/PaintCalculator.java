package Assignment;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args)
    {
        int length;
        int width;
        int height;

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" What is the Length of the wall in feet? >>");
        length = keyboard.nextInt();
        System.out.println(" Width >> ");
        width = keyboard.nextInt();
        System.out.println(" Height >> ");
        height = keyboard.nextInt();

        wallArea(length,width,height);

    }
    public static void wallArea(int length, int width, int height)
    {
        int room;
        room = (length * width)*2 + (width * height)*2;
        numGallons(room);

    }
    public static void numGallons(int room)
    {
        double gallons;
        double rGallons;
        gallons = room/350;
        rGallons = Math.ceil(gallons);
        System.out.println(("You ordered " + rGallons + " gallons"));

        priceTotalGallon(gallons, rGallons);

    }
    public static void priceTotalGallon(double gallons, double rGallons)
    {
        double price;

        price = rGallons * 32;
        System.out.println("Your total will be $ " + price);

    }
}
