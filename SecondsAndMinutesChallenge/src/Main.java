
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    /* MY CODE
    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            seconds = seconds % 60;
            String time = hours + "h " + minutes + "m " + seconds+"s";
            return time;
        }else
            return "Not valid duration";
    }

    public static String getDurationString(int minutes,int seconds ) {
        if (minutes >= 0 && seconds >= 0 && seconds <60) {
            int totalSeconds = seconds + (minutes*60);
            String time = getDurationString(totalSeconds);
            return time;
        }else
            return "Not valid duration";

    }
    */

    //Masterclass Code
    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return getDurationString(minutes,seconds);

    }

    public static String getDurationString(int minutes , int seconds) {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}