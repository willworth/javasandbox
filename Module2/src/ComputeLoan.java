import java.util.Scanner;

public class ComputeLoan {
    public static void main (String[] args){
        //create scanner
        Scanner input = new Scanner(System.in);

        //enter annual interest rate
        System.out.print("Enter annual interest rate, e.g. 73.5% :");
        double annualInterestRate = input.nextDouble();

        //obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        //enter number of years

        System.out.print(
                "Enter number of years as an integer, eg 5: ");
        int numberOfYears = input.nextInt();

        //Enter loan amount

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        //Calculate payment

        double monthlyPayment = loanAmount * monthlyInterestRate / (1
        -1 / Math.pow(1 + monthlyInterestRate, numberOfYears *12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        //display results
        System.out.println("The monthly payment is €" +
                (int)(monthlyPayment *100)/100.0);
        System.out.println("The total payment is €" +
                (int)(totalPayment*100) / 100.00);
    }
}
