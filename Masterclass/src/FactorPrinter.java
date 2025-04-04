public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
    }

    public static void printFactors(int number) {

        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            for(int i = 1; i <= number/2; i++){
                if(number % i == 0){
                    System.out.print(i + "_");
                }
            }
            System.out.println(number);
        }
    }
}
