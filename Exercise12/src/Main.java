public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,42));
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if (temperature >25){
            if (summer && temperature <= 45){
                return true;
            }else if(temperature <= 35){
                return true;
            }
        }return
                false;
    }
}