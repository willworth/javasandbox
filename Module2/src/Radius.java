import java.util.Scanner;


public class Radius {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the cylinder radius: ");
        double x = input.nextDouble();
        double radius = x * x * Math.PI;
        System.out.println("The area is " + radius);



    }

}
