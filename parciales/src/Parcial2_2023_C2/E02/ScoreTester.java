package Parcial2_2023_C2.E02;

public class ScoreTester {
    public static void main(String[] args) {
        ScoreBoard<Double> doubleScoreBoard = new ScoreBoard<>();
        System.out.println(doubleScoreBoard.size());
        doubleScoreBoard.add(new PlayerScore<>("Jenny", 100.5));
        doubleScoreBoard.add(new PlayerScore<>("Jenny", 100.5));
        System.out.println(doubleScoreBoard.size());
        doubleScoreBoard.add(new PlayerScore<>("Jenny", 101.0));
        doubleScoreBoard.add(new PlayerScore<>("Brian", 101.0));

        for (var ps : doubleScoreBoard.getTopScores(5)) {
            System.out.println(ps);
        }

        doubleScoreBoard.add(new PlayerScore<>("Ki", 98.0));

        System.out.println(doubleScoreBoard.getTopScore());
        System.out.println(doubleScoreBoard.getBottomScore());

        for (var ps : doubleScoreBoard.getTopScores(3)) {
            System.out.println(ps);
        }

        System.out.println(doubleScoreBoard.contains(new PlayerScore<>("Ki", 95.0)));
        System.out.println(doubleScoreBoard.contains(new PlayerScore<>("Ki", 98.0)));

        for (var ps : doubleScoreBoard.getTopScores(3)) {
            System.out.println(ps);
        }

        ScoreBoard<Integer> integerScoreBoard = new ScoreBoard<>();
        System.out.println(integerScoreBoard.size());
        System.out.println(integerScoreBoard.contains(new PlayerScore<>("Ted", 200)));
        System.out.println(integerScoreBoard.getTopScores(3).isEmpty());
    }
}
