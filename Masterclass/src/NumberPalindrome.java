public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));
    }

    public static boolean isPalindrome(int number) {
        int givenNumber = number;

        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return givenNumber == reverse;

    }
}
