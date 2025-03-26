public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("Tim",calculateHighScorePosition(1500));
        displayHighScorePosition("Tim",calculateHighScorePosition(1000));
        displayHighScorePosition("Tim",calculateHighScorePosition(500));
        displayHighScorePosition("Tim",calculateHighScorePosition(100));
        displayHighScorePosition("Tim",calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    
    public static int  calculateHighScorePosition(int score){
        if(score >= 1000)
            return 1;
        else if(score >= 500 )
            return 2;
        else if(score >= 100 )
            return 3;
        else
            return 4;
    }
}