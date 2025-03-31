public class ThePrimeNumberChallenge {
    public static void main(String[] args) {


       int primeCounter = 0;
        for(int i =10; i <= 200; i++){
            if(primeCounter == 3) break;
            if(isPrime(i)){
                System.out.println(i+" is a prime number is ");
                primeCounter++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
