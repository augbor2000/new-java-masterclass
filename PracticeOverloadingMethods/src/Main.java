public class Main {
    public static void main(String[] args) {
        System.out.println("5ft,8in = " + convertToCentimeters(5,8));
        System.out.println("68in = " + convertToCentimeters(68));
    }
     public static double convertToCentimeters(int inches){
        double centimeters = inches * 2.54;
        return centimeters;
     }

     public static double convertToCentimeters(int feet,int remainingInches){
        int totalInches = remainingInches + (feet*12);
        double totalCentimeters = convertToCentimeters(totalInches);
        return totalCentimeters;
     }
}