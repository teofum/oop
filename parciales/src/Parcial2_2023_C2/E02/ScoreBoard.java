package Parcial2_2023_C2.E02;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ScoreBoard<S extends Comparable<? super S>> {
    private final SortedSet<PlayerScore<S>> scores = new TreeSet<>();

    public ScoreBoard() {
    }

    public void add(PlayerScore<S> ps) {
        scores.add(ps);
    }

    public boolean contains(PlayerScore<S> ps) {
        return scores.contains(ps);
    }

    public int size() {
        return scores.size();
    }

    public Collection<PlayerScore<S>> getTopScores(int n) {
        return scores.stream().limit(n).collect(Collectors.toList());
    }

    public PlayerScore<S> getTopScore() {
        return scores.getFirst();
    }

    public PlayerScore<S> getBottomScore() {
        return scores.getLast();
    }
}
