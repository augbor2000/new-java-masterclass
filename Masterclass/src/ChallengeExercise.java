import java.util.Scanner;

public class ChallengeExercise {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please select your operation:(+,/),or <exit>");
            String operator = scanner.nextLine();
            if(operator.equals("+")){
                int count = 1;
                int sum = 0;
                while (count <=2){
                    System.out.println("Please enter number :"+ count);
                    try{
                        int number = Integer.parseInt(scanner.nextLine());
                        count++;
                        sum+=number;
                    }catch(NumberFormatException dabUserData) {
                        System.out.println("Please enter a valid number");
                    }
                }
                System.out.println("The sum of number 1 and number 2 is: " + sum);
            }else if(operator.equals("/")) {

                try{
                    System.out.println("Please enter number 1:");
                    int number1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter number 2:");
                    int number2 = Integer.parseInt(scanner.nextLine());
                    try{
                        System.out.println("The division of the 2 numbers is:"+ (number1/number2));
                    }catch(ArithmeticException e) {
                        System.out.println("Division by zero");
                    }
                }catch(NumberFormatException dabUserData) {
                    System.out.println("Please enter a valid number");
                }

                }else if(operator.equals("exit")) {
                break;
            }
        }

            /*int count = 1;
            double result = 0;
            while (count <=2){
                System.out.println("Please enter number :"+ count);
                try{
                    int number = Integer.parseInt(scanner.nextLine());
                    count++;
                    result = number;
                }catch(NumberFormatException dabUserData) {
                    System.out.println("Please enter a valid number");
                }
            }
            System.out.println("The sum of number 1 and number 2 is: " +);
        }
        */


        }
    }

