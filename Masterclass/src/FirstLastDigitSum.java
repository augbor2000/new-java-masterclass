public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigits(252));
    }

    public static int sumFirstAndLastDigits(int number) {
        if(number <0){
            return -1;
        }else{
            int lastDigit = number % 10;
            while(number > 9){
                number /= 10;
            }
            return number + lastDigit;
        }


    }
}
