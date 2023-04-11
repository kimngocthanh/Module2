package ss8;

public class SameScore extends Tennis {

    public SameScore(String player1, String player2, int score1, int score2, int tempScore, String score) {
        super(player1, player2, score1, score2, tempScore, score);
    }

    @Override
    public String getScore() {
        return super.getScore();
    }

    @Override
    public int getScore1() {
        return super.getScore1();
    }

    @Override
    public int getScore2() {
        return super.getScore2();
    }

    @Override
    public String getPlayer1() {
        return super.getPlayer1();
    }

    @Override
    public String getPlayer2() {
        return super.getPlayer2();
    }

    @Override
    public int getTempScore() {
        return super.getTempScore();
    }

    @Override
    public String toString() {
        if (getScore1() == getScore2()) {
            switch (getScore1()) {
                case 0:
                    String getScore = "Love-All";
                    return getScore;
                case 1:
                    return "Fifteen-All";
                case 2:
                    return "Thirty-All";
                case 3:
                    return "Forty-All";
            }
        }
        return "Deuce";
    }
}
