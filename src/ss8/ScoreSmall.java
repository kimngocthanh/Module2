package ss8;

public class ScoreSmall extends Tennis {
    public ScoreSmall(String player1, String player2, int score1, int score2, int tempScore, String score) {
        super(player1, player2, score1, score2, tempScore, score);
    }

    @Override
    public String toString() {
        for (int i = 0; i < 3; i++) {
            if(i==1){
               // getScore()= "love"
            }
            else {
                return "tempScore = score2";
            }
            switch (getTempScore()){
                case 0:
                    return "love";
                case 1:
                    return "Fifteen";
                case 2:
                    return "Thirty";
                case 3:
                    return "Forty";
            }
        } return "a";
    }
}
