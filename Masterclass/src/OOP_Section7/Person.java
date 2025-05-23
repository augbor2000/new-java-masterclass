package OOP_Section7;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public boolean isTeen(){
        if(age >12 && age <20){
            return true;
        }else
            return false;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }

        if(firstName.isEmpty()){
            return lastName;
        }else if(lastName.isEmpty()){
            return firstName;
        }else{
            return firstName + " " + lastName;
        }
    }
}
