package Parcial2_2024_C1.E01;

public interface MatchCollection<T extends Comparable<? super T>> {
    void add(T item);

    T get(int index);

    int size();

    boolean contains(T item);

    void addMatchPredicate(MatchPredicate<T> predicate);

    Iterable<T> getAllMatched();

    Iterable<T> getAllMatchedReversed();

    @FunctionalInterface
    interface MatchPredicate<E> {
        boolean matches(E item);
    }
}
