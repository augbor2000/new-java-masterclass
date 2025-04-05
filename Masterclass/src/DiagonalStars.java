public class DiagonalStars {
    public static void main(String[] args) {
        printSquareStars(2);

    }
    public static void printSquareStars(int number) {

        if (number < 5) {
            System.out.println("Invalid Number");
        }else{
            for (int i = 1; i <=number; i++) {
                for (int j = number; j >= 1; j--) {
                    if(i==1 || j==1 || i ==number || j==number || i == j || j== number-i+1) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }
        }

}
