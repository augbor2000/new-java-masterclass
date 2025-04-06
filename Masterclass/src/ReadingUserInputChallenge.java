import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 5;
        int sum = 0;
        do{
            System.out.println("Enter number #"+ count +":");
            try{
                int  number =Integer.parseInt(scanner.nextLine());
                count--;
                sum+=number;
            }catch (NumberFormatException badUserData){
                System.out.println("Please enter a valid number");
            }
        }while(count >0);

        System.out.println("The sum is "+ sum);
    }
}
