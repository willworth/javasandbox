import java.util.Scanner;
public class PoundsKilos {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pounds:");
        double p = input.nextDouble();
        double kilos = p * 0.454;
        System.out.println(p + " pounds is " + kilos +
        " kilos.");
    }
}
