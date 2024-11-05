package Parcial2_2024_C1.E01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MatchCollectionImpl<T extends Comparable<? super T>> implements MatchCollection<T> {
    private final List<T> items;
    private final List<MatchPredicate<T>> predicates;

    public MatchCollectionImpl() {
        items = new ArrayList<>();
        predicates = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public T get(int index) {
        return items.get(index);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean contains(T item) {
        return items.contains(item);
    }

    @Override
    public void addMatchPredicate(MatchPredicate<T> predicate) {
        predicates.add(predicate);
    }

    @Override
    public Iterable<T> getAllMatched() {
        return getAllMatchedImpl(Comparator.naturalOrder());
    }

    @Override
    public Iterable<T> getAllMatchedReversed() {
        return getAllMatchedImpl(Comparator.reverseOrder());
    }

    private Iterable<T> getAllMatchedImpl(Comparator<T> comparator) {
        var filtered = items.stream().filter((item) -> predicates.stream().allMatch((p) -> p.matches(item)));
        return filtered.collect(Collectors.toCollection(() -> new TreeSet<>(comparator)));
    }
}
