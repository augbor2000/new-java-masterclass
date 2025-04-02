public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigits(23,24));

    }

    public static boolean hasSharedDigits(int number1, int number2) {
        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }else{
            if((number1%10 == number2%10)|| (number1%10 == number2/10)) {
                return true;
            }else if((number1/10 == number2%10) ||(number1/10 == number2/10) ) {
                return true;
            }else
                return false;

        }
    }
}
