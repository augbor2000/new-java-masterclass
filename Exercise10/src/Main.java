public class Main {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static final int MIN_PER_HOUR = 60;
    public static final int HOUR_PER_DAY= 24;
    public static final int DAY_PER_YEAR = 365;
    public static final int MIN_PER_DAY =HOUR_PER_DAY *MIN_PER_HOUR;
    public static final int MIN_PER_YEAR = MIN_PER_DAY *DAY_PER_YEAR;

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid input");
            return;
        }else{
            long years = minutes/MIN_PER_YEAR;
            long days = (minutes/MIN_PER_DAY) % DAY_PER_YEAR;
            System.out.println(minutes + " min = "+years + " y and " + days + " d");
        }
    }
}