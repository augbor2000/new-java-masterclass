import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int counter = 0;
        do{
            try{
                System.out.println("Please enter a number , or any character to exit:");
                int number = Integer.parseInt(scanner.nextLine());
                if(counter == 0 || number < min){
                    min = number;
                }
                if(counter == 0 || number > max){
                    max = number;
                }
                counter ++;
            }catch(NumberFormatException e){
                break;
            }

        }while(true);
        if(counter >0){
            System.out.println("Your minimum number is " + min + " and maximum number is " + max);
        }else{
            System.out.println("Invalid input");
        }
    }
}
