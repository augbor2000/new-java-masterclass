public class WhileLoopChallenge {

    public static void main(String[] args) {

       int startNumber =4;
       int endNumber = 20;
       int totalEven = 0;
       int totalOdd = 0;
       while(startNumber<=endNumber){
           startNumber++;
           if(!isEvenNumber(startNumber)){
               totalOdd++;
               continue;
           }
           totalEven++;
           if(totalEven==5){
               break;
           }
           System.out.println(startNumber + " is even number");
       }
       System.out.println("The total even number is :" + totalEven);
       System.out.println("The total odd number is :" + totalOdd);

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
