import java.util.Scanner;
// calculate tips with subtotal and percentage.


//variable names are not good/clear...

public class Tips {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What is the subtotal?");
    double sub = input.nextDouble();
    System.out.println("What percentage tip would you "+
    "like to leave?");
    double tip = input.nextDouble();
    double percent = tip /100;
    double result = sub * percent;
    double answer = result + sub;
    System.out.println("The tip is €" + result +
    " and the total is €" + answer);


    }
}
