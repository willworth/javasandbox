import java.util.Scanner;

public class SimpleCylinder {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the cylinder radius: ");
        double x = input.nextDouble();
        double area = x * x * Math.PI;
        System.out.println("Please enter the cylinder length: ");
        double j = input.nextDouble();
        double volume = area * j;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);



    }
}
