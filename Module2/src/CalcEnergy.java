import java.util.Scanner;

public class CalcEnergy {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of water in kgs: ");
    double water = input.nextDouble();
    System.out.println("Enter the initial temp in C: ");
    double initTemp = input.nextDouble();
    System.out.println("Enter the final temp in C: ");
    double finalTemp = input.nextDouble();


    double q = water * (finalTemp - initTemp) * 4184;

    System.out.println("The energy needed, in joules, is :" +
            q);



    }
}
