package ss8;

public class ScoreFour extends Tennis {
    private int minusResult = getScore1() - getScore2();

    public ScoreFour(String player1, String player2, int score1, int score2, String score) {
        super(player1, player2, score1, score2, score);
    }


    @Override
    public String toString() {
        if (minusResult == 1) {
            setScore("advantage");
            return getScore() +" "+ getPlayer1();
        } else if (minusResult == -1) {
            setScore("advantage");
            return getScore() +" "+ getPlayer2();
        } else if (minusResult >= 2) {
            setScore("win for");
            return getScore() +" "+ getPlayer1();
        }
        setScore("win for");
        return getScore() +" "+ getPlayer2();
    }
}
