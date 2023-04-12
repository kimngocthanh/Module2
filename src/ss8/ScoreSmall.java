package ss8;

public class ScoreSmall extends Tennis {
    public ScoreSmall(String player1, String player2, int score1, int score2, String score) {
        super(player1, player2, score1, score2, score);
    }

    @Override
    public String toString() {
        switch (getScore1()) {
            case 0:
                setScore("love");
                break;
            case 1:
                setScore("fifteen");
                break;
            case 2:
                setScore("thirty");
                break;
            case 3:
                setScore("forty");
                break;
        }
        String score1 = getScore();
        switch (getScore2()){
            case 0:
                setScore("- love");
                break;
            case 1:
                setScore("- fifteen");
                break;
            case 2:
                setScore("- thirty");
                break;
            case 3:
                setScore("- forty");
                break;
        }
        return  score1+ getScore();
    }
}
