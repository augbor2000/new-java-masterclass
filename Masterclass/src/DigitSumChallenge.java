public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int number) {
        int sum = 0;
        if(number < 0) {
            return -1;
        }else {
            do{
                sum += number%10;
                number/=10;
            }while(number!=0);
        }
        return  sum;
    }

}
