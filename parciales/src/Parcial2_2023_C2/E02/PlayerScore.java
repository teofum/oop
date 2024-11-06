package Parcial2_2023_C2.E02;

import java.util.Objects;

public class PlayerScore<S extends Comparable<? super S>> implements Comparable<PlayerScore<S>> {
    private final String player;
    private final S score;

    public PlayerScore(String player, S score) {
        this.player = player;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player %s scored %s".formatted(player, score);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PlayerScore<?> ps) {
            return player.equals(ps.player) && score.equals(ps.score);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, score);
    }

    @Override
    public int compareTo(PlayerScore<S> ps) {
        var scoreDiff = ps.score.compareTo(score);
        return scoreDiff == 0 ? player.compareTo(ps.player) : scoreDiff;
    }
}
