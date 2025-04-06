import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.print("Enter an Integer, or any key to exit:");
            try{
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                count++;
            }catch(NumberFormatException notInteger){
                break;
            }
        }
        try{
            System.out.println("SUM = " + sum + " AVG = "+ Math.round((double)sum/count));
        }catch(ArithmeticException divideByZero){
            System.out.println("SUM = " + sum + " AVG = 0");
        }

    }
}
