
//This is just to practise creating and calling methods.  As such,
//the contents themselves are simple.




public class MethodClass {


    //simple method

    //return type    method name   (values)
    public static int mySimpleSummingMethod (int a, int b){
            int ans = a + b;
            //return type must be the same as declared above
            return ans;


    }

    public static void main (String[] args){

        int x = 3;
        int y = 6;
        int j = mySimpleSummingMethod(x,y);
        System.out.println("The sum of x and y is : " + j);
    }




}
