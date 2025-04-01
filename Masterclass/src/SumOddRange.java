public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(100,100));
    }

    public static boolean isOdd(int number){
        if(number >0){
            return number % 2 != 0;
        }else
            return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end >= start && end >0 && start >0){
            for (int i = start ;i<=end;i++){
               if(isOdd(i)){
                   sum += i;
               }
            }
        }else
            return -1;
        return sum;
    }
}
