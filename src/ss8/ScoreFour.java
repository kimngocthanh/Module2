package ss8;

public class ScoreFour extends Tennis {
    private int minusResult = getScore1() - getScore2();

    public ScoreFour(String player1, String player2, int score1, int score2) {
        super(player1, player2, score1, score2);
    }

    public int getMinusResult() {
        return minusResult;
    }

    public void setMinusResult(int minusResult) {
        this.minusResult = minusResult;
    }

    @Override
    public String toString() {
        if (minusResult == 1) {
            return "score = Advantage player1";
        } else if (minusResult == -1) {
            return "score =Advantage player2";
        } else if (minusResult >= 2) {
            return "score = Win for player1";
        }
        return "score = win for player2";
    }
}
