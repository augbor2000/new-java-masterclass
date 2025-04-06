import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        int currentYear = 2025;
      //  System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course");

        String dateOfBirthday = System.console().readLine("What year were you born ? ");
        int age = currentYear - Integer.parseInt(dateOfBirthday);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course");

        System.out.println("What year were you born ? ");

        boolean isValid = false;
        int age = 0;

        do{
            System.out.println("Enter a date of birth >=" + (currentYear -125) + "and <= " + currentYear);
            try{
                age = checkData(currentYear,scanner.nextLine());
                isValid = age <0?false:true;
            }catch(NumberFormatException badUserData){
                System.out.println("Character not allowed !!! Try again.");
            }

        }while(!isValid);

        return "So you are " + age + " years old";
    }
    public static int checkData(int currentYear,String dateOfBirthday) {

        int dob = Integer.parseInt(dateOfBirthday);
        int minimumYear = currentYear-125;
        if(dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear-dob;
    }


}
