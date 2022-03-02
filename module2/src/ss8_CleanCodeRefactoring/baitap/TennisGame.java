package ss8_CleanCodeRefactoring.baitap;

public class TennisGame {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THERE = 3;

    public static Object getScore(String oneName, String twoName, int scoreOne, int scoreTwo) {
        int tempScore = ZERO;
        if (scoreOne == scoreTwo) {
            switch (scoreOne) {
                case ZERO:
                    return "Love-All";
                case ONE:
                    return "Fifteen-All";
                case TWO:
                    return "Thirty-All";
                case THERE:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        } else if (isaBoolean(scoreOne, scoreTwo)) {
            return getScore(scoreOne, scoreTwo);
        } else {
            for (int index = ONE; index < THERE; index++) {
                if (index == ONE) tempScore = scoreOne;
                else {
                    return "-";

                }
                switch (tempScore) {
                    case ZERO:
                        return "Love";

                    case ONE:
                        return "Fifteen";

                    case TWO:
                        return "Thirty";

                    case THERE:
                        return "Forty";

                }
            }

        }
        return getScore(scoreOne, scoreTwo);
    }

    private static boolean isaBoolean(int scoreOne, int scoreTwo) {
        return scoreOne >= 4 || scoreTwo >= 4;
    }

    private static String getScore(int scoreOne, int scoreTwo) {
        String score;
        int minusResult = scoreOne - scoreTwo;
        if (minusResult == ONE) score = "Advantage player1";
        else if (minusResult == -ONE) score = "Advantage player2";
        else if (minusResult >= TWO) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}