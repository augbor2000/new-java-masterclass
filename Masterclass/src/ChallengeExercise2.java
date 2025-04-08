import java.util.Scanner;

public class ChallengeExercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your string");
        String input = scanner.nextLine();
        int length = input.length();
        for(int i = length - 1; i >= 0; i--) {
            System.out.print(input.charAt(i) + " ");
        }
    }
}
