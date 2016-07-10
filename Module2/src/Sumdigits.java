import java.util.Scanner;
public class Sumdigits {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000:");
        int j = input.nextInt();

        if (j<10){
            System.out.println("There is nothing to add!");

        }else if(j<100){
            int tens = j/10;
            int units = j% 10;
            int result = tens + units;
            System.out.println("tens = "+ tens);
            System.out.println("units = "+ units);
            System.out.println("The digits of "+ j +
            " added together equal: " + result + ".");


        }else {
            //code for greater than 100
            int hundreds = j/100;
            int tens = j%100/10;
            int units = j% 10;
            int result = hundreds + tens + units;
            System.out.println("hundreds = "+ hundreds);
            System.out.println("tens = "+ tens);
            System.out.println("units = "+ units);
            System.out.println("The digits of "+ j +
                    " added together equal: " + result + ".");

        }





    }
}
