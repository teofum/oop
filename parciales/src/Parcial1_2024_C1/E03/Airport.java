package Parcial1_2024_C1.E03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Airport {
    private int counterCount = 0;
    private Counter[] counters = new Counter[INITIAL_DIM];
    private static final int INITIAL_DIM = 10;
    private static final Comparator<Counter> AIRLINE_ORDER = Comparator
            .comparing(Counter::getAirline)
            .thenComparingInt(Counter::getNumber);

    public Counter addCounter(String airline) {
        Counter counter = new Counter(counterCount, airline);

        if (counterCount >= counters.length) resize();
        counters[counterCount++] = counter;

        return counter;
    }

    public void counterCheckIn(CounterCondition condition) {
        for (Counter counter : counters) {
            if (condition.test(counter)) {
                counter.checkIn();
                return;
            }
        }
    }

    public Iterable<Counter> airlineOrderCounters() {
        return new CounterOrder(counters, counterCount, AIRLINE_ORDER);
    }

    public Iterable<Counter> airlineDescendingOrderCounters() {
        return new CounterOrder(counters, counterCount, AIRLINE_ORDER.reversed());
    }

    private void resize() {
        counters = Arrays.copyOf(counters, counters.length + INITIAL_DIM);
    }

    @FunctionalInterface
    public interface CounterCondition {
        boolean test(Counter counter);
    }

    private static class CounterOrder implements Iterable<Counter> {
        private final Counter[] counters;

        public CounterOrder(Counter[] counters, int dim, Comparator<Counter> comparator) {
            this.counters = Arrays.copyOf(counters, dim);
            Arrays.sort(this.counters, comparator);
        }

        @Override
        public Iterator<Counter> iterator() {
            return new Iterator<>() {
                private int i = 0;

                public boolean hasNext() {
                    return i < counters.length;
                }

                public Counter next() {
                    return counters[i++];
                }
            };
        }
    }
}
