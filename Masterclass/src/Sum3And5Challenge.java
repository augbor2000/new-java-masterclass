public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " are met the conditions");
                sum += i;
                count++;
                if (count == 5) {
                    System.out.println("There are 5 conditions met");
                    break;
                }
            }
        }
        System.out.println("The total Sum is " + sum);
    }
}
