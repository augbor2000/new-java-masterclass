public class Main {
    public static void main(String[] args) {
        
    }

    public static void printEqual(int a, int b, int c) {
        if(a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Input");
        }else if(a == b && b == c){
            System.out.println("All number are equal!");
        }else if(a != b && a != c && b != c){
            System.out.println("All numbers are different!");
        }else{
            System.out.println("Neither all numbers are equal or different!");
        }
    }
}