import java.util.Scanner;
//simple unit converter. 1 foot = 0.305 meters

public class FeetMeters {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a vaule for feet:");6
        double x = input.nextDouble();
        double metres = x * 0.305;
        System.out.println(x +" feet is equal to " + metres +
        " metres.");


    }

}
