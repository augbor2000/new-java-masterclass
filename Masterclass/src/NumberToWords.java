public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1010);
    }
    public static void numberToWords(int number) {
        if(number < 0){
            System.out.println("Invalid number");
        }else if(number == 0){
            System.out.println("Zero");
        }
        int reversedNumber = reverse(number);
        while(reversedNumber > 0){
            int temp = reversedNumber%10;
            switch(temp){
                case 0:
                    System.out.println(" Zero ");
                    break;
                case 1:
                    System.out.println(" One ");
                    break;
                case 2:
                    System.out.println(" Two ");
                    break;
                case 3:
                    System.out.println(" Three ");
                    break;
                case 4:
                    System.out.println(" Four ");
                    break;
                case 5:
                    System.out.println(" Five ");
                    break;
                case 6:
                    System.out.println(" Six ");
                    break;
                case 7:
                    System.out.println(" Seven ");
                    break;
                case 8:
                    System.out.println(" Eight ");
                    break;
                case 9:
                    System.out.println(" Nine ");
                    break;
            }
            reversedNumber/=10;
        }
        int missedZero = getDigitNumber(number)-getDigitNumber(reverse(number));
        for(int i = missedZero; i > 0; i--){
            System.out.println(" Zero ");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitNumber(int number) {
        if(number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int count = 0;
        while(number != 0) {
            number/=10;
            count++;
        }
        return count;
    }
}
