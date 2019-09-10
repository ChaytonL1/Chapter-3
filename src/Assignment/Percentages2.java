

package Assignment;

import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args)
    {
        double a;
        double b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first number >> ");
        a = keyboard.nextInt();
        System.out.println("Enter your second number >> ");
        b = keyboard.nextInt();

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
