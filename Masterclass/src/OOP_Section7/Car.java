package OOP_Section7;

public class Car {
    private String make;
    private String color;
    private String model;
    private int doors;
    private boolean convertible;

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                model + " " +
                make + " " +
                (convertible ? "convertible" : ""));
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {

        if(make == null){
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden","porsche","tesla" -> this.make = make;
            default -> this.make ="unsupported";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
