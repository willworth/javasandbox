/**
 * for (initialization; condition; increment/decrement) {
 statement(s) //block of statements
 }
 *
 */
public class Powers {
    public static void main (String[] args){
        for(int i = 1; i<21; i++ ){
            System.out.println("When i is: " + i);
            System.out.println("The square of " +i+ " is "+ (i*i));
            System.out.println("The cube of " +i+ " is " + (i*i*i));
        }

    }
}
