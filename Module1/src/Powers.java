/**
 * for (initialization; condition; increment/decrement) {
 statement(s) //block of statements
 }
 *git check
 */
public class Powers {
    public static void main (String[] args){
        for(int i = 1; i<51; i++ ){
            System.out.print("When i is " + i);
            System.out.print(", the square of " +i+ " is "+ (i*i));
            System.out.println(", and the cube of " +i+ " is " + (i*i*i));
        }

    }
}
