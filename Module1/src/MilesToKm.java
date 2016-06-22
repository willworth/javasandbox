import java.util.Scanner;

/*
 * 1 km: 0.62137119 mi
 1 mile: 1.609344 km
 TODO convert string input to lowercase.
 TODO investigate char usage.
 */

public class MilesToKm
{
    public static void main (String args[])

    {
        int a;

        Scanner s = new Scanner(System.in);
        System.out.println("Please convert the number of miles you wish to convert");
        a=s.nextInt();
        System.out.println("You entered " + a);

        double x = a * 1.609344;
        System.out.println(a + "in kilometres is " + x);

    }




}
