package E07_08;

public class IntervalTester {
    public static void main(String[] args) {
        Interval interval = new Interval(2.5, 7.8);
        System.out.println(interval);
        System.out.println(interval.size()); // 6
        System.out.println(interval.at(2)); // 3.5
        System.out.println(interval.indexOf(4.5)); // 3
        System.out.println(interval.indexOf(4.7)); // 0
        System.out.println(interval.includes(4.7)); // false
        System.out.println(interval.includes(5.5)); // true
        System.out.println(interval.count((x) -> Math.round(x - 0.5) % 2 == 0)); // 3

        Interval interval2 = new Interval(2.5, 8.5, 0.1);
        System.out.println(interval2);
        System.out.println(interval2.size()); // 61
        System.out.println(interval2.at(2)); // 2.6
        System.out.println(interval2.includes(4.7)); // true
    }
}
