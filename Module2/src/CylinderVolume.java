import java.util.Scanner;
/**
 * read radius and length and return area and volume
 *
 */
public class CylinderVolume {

    public static double area;
    public static double volume;


    //method

    public static void  areaVolume (double radius, double length){

    double area = radius * radius * Math.PI;
    double volume = area * length;

    }

    public static double getArea(){
        return area;
    }
    public static double getVolume(){
        return volume;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the cylinder radius: ");
        double  x = input.nextDouble();
        System.out.println("Please enter the cylinder area: ");
        double y = input.nextDouble();

        areaVolume(x,y);
        System.out.println("The area is " +  getArea()+"."+
               "The volume is "+  getVolume());

    };
}
