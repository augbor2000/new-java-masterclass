package OOP_Section7;

public class Fish extends Animal{
    private int  gills;
    private int fins;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.print("Muscle moving");
    }

    private void moveBackFin(){
        System.out.print("BackFin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed =="fast"){
            moveBackFin();
        }
        System.out.println();
    }
}
