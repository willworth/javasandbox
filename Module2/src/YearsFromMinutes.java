import java.util.Scanner;


// from minutes input calculate total years
//1 day = 1440 minutes
//365 days= 525600


public class YearsFromMinutes {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Convert minutes to years!");
        System.out.println("(Max 2 billion minutes)");
    System.out.println("Enter the number of minutes you" +
    " wish to convert:");
    int minutes =input.nextInt();
    //what's left after the years are taken in minutes, divided into days
    int days = minutes  % 525600/1440;
    //mins divided into days, then divided into years.
    int years = minutes / 1440 /365;


    System.out.println(minutes +" equals " + years + " years and " +
    days + " days."
    );








    }
}
