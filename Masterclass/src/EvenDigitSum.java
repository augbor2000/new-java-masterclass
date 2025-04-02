public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }else {
            int sum = 0;
            while (number > 0) {
                if(isEven(number % 10) ) {
                    sum += number%10;
                }
                number /= 10;
            }
            return sum;
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
