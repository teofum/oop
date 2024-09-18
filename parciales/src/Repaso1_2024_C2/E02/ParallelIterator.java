package Repaso1_2024_C2.E02;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<T> implements Iterator<ParallelIterator.Pair<T>> {
    private final T[] v1, v2;
    private int i = 0;

    public ParallelIterator(T[] v1, T[] v2) {
        if (v1 == null) throw new NullPointerException("First collection missing");
        if (v2 == null) throw new NullPointerException("Second collection missing");

        this.v1 = v1;
        this.v2 = v2;
    }

    public boolean hasNext() {
        return i < v1.length && i < v2.length;
    }

    public Pair<T> next() {
        if (!hasNext()) throw new NoSuchElementException();

        return new Pair<>(v1[i], v2[i++]);
    }

    public static class Pair<E> {
        private final E first, second;

        public Pair(E first, E second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "{" + first + "," + second + "}";
        }
    }
}
