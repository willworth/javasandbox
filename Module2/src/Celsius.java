import java.util.Scanner;


public class Celsius {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double x = input.nextDouble();
        double fahrenheit = (9.0/5) * x + 32;
        System.out.println(x + " is " + fahrenheit + " degrees fahrenheit. ");






    }

}
