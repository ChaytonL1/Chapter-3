package Assignment;

import java.util.Scanner;

public class BookStoreCredit {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);

        String name;
        double credit;

        System.out.println(" Please Enter Your Name --> ");
        name = keyboard.nextLine();
        System.out.println(" Please Enter Your Credit --> ");
        credit = keyboard.nextInt();

        computeCredit(name,credit);

    }
    public static void computeCredit(String name, double credit)
    {
        double newCredit;

        newCredit = credit *10;
        System.out.println(" Hello " + name + " your gpa is " + credit + "\n and your credit will be $" + newCredit);



    }
}
