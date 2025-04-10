package OOP_Section7;

public class Main {
    public static void main(String[] args) {
       /* Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("Black");
        car.setConvertible(true);
        System.out.println( "make = " + car.getMake());
        System.out.println( "model = " + car.getModel());

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setColor("Red");
        targa.setConvertible(false);

        targa.describeCar();*/

        // SIMPLE_CALCULATOR
        /*
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(100.0);
        calculator.setSecondNumber(0);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());
        */

        //Person

        /*
        Person  person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(19);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

    }

         */

        // CONSTRUCTOR CHALLENGE EXERCISE

        Customer customer = new Customer("Stefan",200,"stefan@gmail.com");
        System.out.println(customer.getEmailAddress());
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());

    }
}
