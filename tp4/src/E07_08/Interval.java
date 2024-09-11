package E07_08;

import java.util.Objects;

public class Interval {
    private final double start, end, increment;
    private static final double EPSILON = 1e-8;

    public Interval(double start, double end, double increment) {
        if (increment == 0 || (start > end && increment > 0) || (start < end && increment < 0))
            throw new IllegalArgumentException(); // No throws clause needed, unchecked exception

        this.start = start;
        this.end = end;
        this.increment = increment;
    }

    public Interval(double start, double end) {
        this(start, end, 1);
    }

    public long size() {
        return (long) Math.floor((end - start) / increment) + 1;
    }

    public double at(long idx) {
        if (idx < 1 || idx > size()) throw new IllegalArgumentException();
        return start + (idx - 1) * increment;
    }

    public long indexOf(double x) {
        double y = (x - start) / increment;
        long index = Math.round(y);
        return (index - y < EPSILON) ? index + 1 : 0;
    }

    public boolean includes(double x) {
        return indexOf(x) != 0;
    }

    public long count(IntervalCondition condition) {
        long count = 0;
        double min = Math.min(start, end), max = Math.max(start, end), i = start <= end ? increment : -increment;

        for (double x = min; x <= max; x += i)
            if (condition.test(x)) count++;

        return count;
    }

    @Override
    public String toString() {
        return "Interval [" + start + "; " + end + " / " + increment + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Interval other)) return false;
        return Double.compare(other.start, start) == 0 &&
                Double.compare(other.end, end) == 0 &&
                Double.compare(other.increment, increment) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, increment);
    }
}
