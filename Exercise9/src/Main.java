public class Main {
    public static void main(String[] args) {
        System.out.println(area(5.5));
        System.out.println(area(4,5));

    }
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }else{
            return radius * radius* Math.PI;
        }
    }

    public static double area(double x,double y){
        if(x < 0 || y < 0){
            return -1.0;
        }else{
            return x * y;
        }
    }
}