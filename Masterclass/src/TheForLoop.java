public class TheForLoop {
    public static void main(String[] args) {
        for(int counter =1; counter <= 5;counter ++){
            System.out.println(counter);
        }
        for(double rate =2.0; rate <= 5.0; rate ++){
            double interestAmount = calculateInterest(10000.0,rate);
            System.out.println("10,000 at " + rate + " interest is " + interestAmount);
        }
        System.out.println("-----------------");
        for(double quarterRate =7.5; quarterRate <= 10.0; quarterRate +=0.25){
            double newInterest = calculateInterest(100.00,quarterRate);
            System.out.println("$100 at " + quarterRate + " interest is " + newInterest);
        }
    }

    public static double calculateInterest(double amount,double interestRate){
        return amount * (interestRate/100);
    }
}
