import java.util.Scanner;

//calculate acceleration
public class PhysicsAcceleration {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter starting velocity "+
        "in meters per second, the ending velocity in mps " +
        "and the time span in seconds:");
        double velStart = input.nextDouble();
        double velEnd = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (velEnd - velStart)/ time;

        System.out.println("The average acceleration is " +
                acceleration);






    }



}
