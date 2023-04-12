package ss8;

public class SameScore extends Tennis {

    public SameScore(String player1, String player2, int score1, int score2, String score) {
        super(player1, player2, score1, score2, score);
    }

    public String toString() {
        switch (getScore1()) {
            case 0:
                setScore("love all");
                return getScore();
            case 1:
                setScore("Fifteen-All");
                return getScore();
            case 2:
                setScore("Thirty-All");
                return getScore();
            case 3:
                setScore("Forty-All");
                return getScore();
        }
        setScore("Deuce");
        return getScore();
    }
}
