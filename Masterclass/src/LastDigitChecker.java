public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10,1000,356));
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(9,99,999 ));

    }

    public static boolean hasSameLastDigit(int first, int second, int last) {

        if(isValid(first) && isValid(second)&& isValid(last)) {
            int firstDigit = first % 10;
            int secondDigit = second % 10;
            int lastDigit = last % 10;
            if((firstDigit == secondDigit) || (firstDigit == lastDigit) || (secondDigit == lastDigit)) {
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }
    public static boolean isValid(int number) {
        if(number>=10 && number<=1000){
            return true;
        }else{
            return false;
        }
    }
}
