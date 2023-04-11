package ss8;

public class Tennis {
    private String player1;
    private String player2;
    private int score1;
    private int score2;
    private int tempScore =0;
    private String score =" ";

    public Tennis(String player1, String player2, int score1, int score2, int tempScore, String score) {
        this.player1 = player1;
        this.player2 = player2;
        this.score1 = score1;
        this.score2 = score2;
        this.tempScore = tempScore;
        this.score = score;
    }

    public Tennis(String player1, String player2, int score1, int score2, String score) {
        this.player1 = player1;
        this.player2 = player2;
        this.score1 = score1;
        this.score2 = score2;
        this.score=score;
    }

    public Tennis(String player1, String player2, int score1, int score2) {
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getTempScore() {
        return tempScore;
    }

    public void setTempScore(int tempScore) {
        this.tempScore = tempScore;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    @Override
    public String toString() {
        return "player1='" + player1 + '\'' +
                ", player2='" + player2 + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 ;
    }
}
