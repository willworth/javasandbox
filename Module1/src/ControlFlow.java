import java.util.Scanner;

public class ControlFlow {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");

        double usernum = input.nextDouble();

        if(usernum > 100){
            System.out.println("Wow! That´s a big number!");
        }else{
            System.out.println("Is that the best you can do?");
        }






    }
}
