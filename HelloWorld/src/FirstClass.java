public class FirstClass {

    public static void main(String[] args) {
        double myDouble = 20.00;
        double secondDouble = 80.00;
        double myTotal = (myDouble + secondDouble)*100.00;
        double  myResult = myTotal % 40.00 ;
        boolean isZero ;
        if(myResult == 0.00){
            isZero = true;
        }
        else
            isZero = false;
        System.out.println(isZero);
        if(!isZero){
            System.out.println("Got some remainder");
        }
    }


}
