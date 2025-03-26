//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       boolean answer = shouldWakeUp(false,2);
       System.out.println(answer);
    }

    public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            System.out.println("Not a valid hour!");
            return false;
        }else if(isBarking){
            if(hourOfDay <= 8 || hourOfDay >= 22){
                return true;
            }else
                return false;

        }else
            System.out.println("Dog is not barking");

        return false;
    }

}