public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first <10 || second <10){
            return -1;
        }
        int maxDivisor = 0;
        int minNumber = Math.min(first, second);
        for(int i=2; i<=minNumber/2; i++){
            if(minNumber % i == 0  && second%i == 0){
                maxDivisor = i;
            }

        }
        return maxDivisor;

    }

}
