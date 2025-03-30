public class NewSwitchChallenge {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);


    }

    public static void printDayOfTheWeek(int day){

       String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a valid day";
        };
       System.out.println(day + " stands for " + dayOfWeek);
    }

    //Same output  with printDayOfTheWeek
    public static void printWeekDay(int day){
        String dayOfWeek= "Invalid Day";
        if (day == 0){
            dayOfWeek ="Sunday";
        }else if (day == 1){
            dayOfWeek ="Monday";
        }else if (day == 2){
            dayOfWeek ="Tuesday";
        }else if (day == 3){
            dayOfWeek ="Wednesday";
        }else if (day == 4){
            dayOfWeek ="Thursday";
        }   else if (day == 5){
            dayOfWeek ="Friday";
        }else if (day == 6){
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
