public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(6, 5);
        Point p2 = new Point(3, 1);
        System.out.println("Distance (0,0) = " + p1.distance());

        System.out.println("Distance (p2) = " + p1.distance(p2));

        System.out.println("Distance (2,2) = " + p1.distance(2,2));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }
}