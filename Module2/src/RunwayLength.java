import java.util.Scanner;


public class RunwayLength {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter speed and acceleration:");
    double v = input.nextDouble();
    double a = input.nextDouble();

    double length = (Math.pow(v,2))/2*a;

    System.out.println("The minimum runway length required is " +
    length + "meters.");





    }




}
