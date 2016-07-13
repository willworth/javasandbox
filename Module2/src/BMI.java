import java.util.Scanner;
public class BMI {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter weight in kg:");
        double weight = input.nextDouble();

    System.out.println("Enter height in meters:");
        double height = input.nextDouble();

    double bmi = weight / Math.pow(height,2);

    System.out.println("2 to the 3 =  " + Math.pow(2,3));
    System.out.println("Your BMI is:" + bmi);







    }
}
