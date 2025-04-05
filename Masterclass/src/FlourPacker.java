public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        final int bigCountValue = 5;
        final int smallCountValue = 1;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int totalBigValue = bigCount * bigCountValue;
        if (totalBigValue >= goal) {
            int remainingValue = goal % bigCountValue;
            if (remainingValue <= smallCountValue * smallCount) {
                return true;
            }
        } else if (smallCount >= goal - totalBigValue) {
            return true;
        }
        return false;
    }

    }

