
public class Main {
    public static void main(String[] args) {
        /*
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("s92300",
                    switch(i){
                        case 1-> "Mary";
                        case 2-> "John";
                        case 3-> "Jane";
                        case 4-> "Bob";
                        case 5-> "Lisa";
                        default -> "Anonymous";
            },"05/11/1985","Java Masterclass");

            System.out.println(s);


            Student pojoStudent = new Student("s923006","Anna","08/12/1985","Java Masterclass");
            LPAStudent recordStudent = new LPAStudent("s923007","Bill","12/08/1985","Java Masterclass");

            System.out.println(pojoStudent);
            System.out.println(recordStudent);

            pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
          //  recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

            System.out.println(pojoStudent.getName() + "is taking " + pojoStudent.getClassList());
            System.out.println(recordStudent.name() + "is taking " + recordStudent.classList());
        }

         */

        Wall wall = new Wall(5,4);
        System.out.println("The area of the wall is " + wall.getArea());
        wall.setHeight(-1);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
    }
}