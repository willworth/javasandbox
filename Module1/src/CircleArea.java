import java.util.Scanner;

public class CircleArea {
    public static void main (String [] args){
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        //works the same for byte short int long float
        double radius = input.nextDouble();
        double area = radius * radius * PI;  //constants all upper case

        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
