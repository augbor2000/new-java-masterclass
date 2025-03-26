public class MainChallenge {
    public static void main(String[] args) {

        int highScore = calculateScore(true,8,200,10000);
        System.out.println("The high score is " + highScore);
        calculateScore(true,5,100,800);
    }

    public static int calculateScore(boolean gameOver, int levelCompleted, int bonus, int score) {

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was :" + finalScore);
        }
        return finalScore;

    }
}