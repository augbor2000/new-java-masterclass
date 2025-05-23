public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        // Distance between this point and (0,0)
        return Math.sqrt(Math.pow(this.x , 2) + Math.pow(this.y , 2));
    }
    public double distance(Point p) {
        // Distance between Point p and this Point
        return Math.sqrt(Math.pow( p.x - this.x, 2) + Math.pow( p.y - this.y , 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}
