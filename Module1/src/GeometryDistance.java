import java.util.Scanner;
public class GeometryDistance {

    //method

    static double twoPoints(double x1, double y1, double x2, double y2){


        double a= Math.pow((x2 -x1),2) + Math.pow((y2 -y1),2);

        return Math.pow(a,0.5);


    }

public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter x1 and y1:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.println("Enter x2 and y2:");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    System.out.println("The distance between the 2 points is " +
    twoPoints(x1,y1,x2,y2)
    );




}


}
