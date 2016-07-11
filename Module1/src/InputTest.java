import java.util.Scanner;
//this is just testing multi inputs from user

public class InputTest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the two numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = x + y;
        System.out.println("The two numbers added equal " + z);

    }





}
