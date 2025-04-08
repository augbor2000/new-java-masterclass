import java.util.Scanner;

public class PalindromeExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= scanner.nextLine();
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if(s.equals(reverse)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
