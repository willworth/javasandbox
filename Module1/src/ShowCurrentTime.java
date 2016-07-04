// spanish time not safe 2200 and beyond.
public class ShowCurrentTime {
    public static void main(String[] args){
        //total milliseconds since midnight jan first 1970
        long totalMilliseconds = System.currentTimeMillis();

        //get seconds
        long totalSeconds = totalMilliseconds / 1000;

        //compute the current seconds in the minute in the hour
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        //display the bloody time, finally
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute +":" + currentSecond + " GMT");
//        notice this error:
//        Current time is 23:3:14 GMT
//        Current time in Spanish summertime is 25:3:14 CET+2
//
        System.out.println("Current time in Spanish summertime is " + (currentHour +2)+ ":"
                + currentMinute +":" + currentSecond + " CET+2");









    }
}
