import java.util.Scanner;


public class TimesTablesTest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            int number1 = (int)(Math.random() *10);
            int number2 = (int)(Math.random() *10);

            //swap numbers here


            System.out.println("What is " + number1 + " x " +
            number2 + " ?"
            );
            int answer = input.nextInt();

            if (number1 * number2 == answer)
                System.out.println("Correct!");
            else
                System.out.println(number1+ " x " +
                number2 +  " is " + (number1 * number2));
            System.out.println("");

            System.out.println("Do you wish to repeat?");
            System.out.println("press 1 to repeat or");
            System.out.println("press 2 to exit.");
            x = input.nextInt();


        }

    }

}
