package Parcial1_2023_C2.E03;

import java.util.Arrays;
import java.util.Comparator;

public class MinToMaxReport<R> implements ReportCollection<R> {
    private R[] reports;
    private int index;
    private final Comparator<? super R> comparator;
    private final static int INITIAL_SIZE = 10;

    public MinToMaxReport(Comparator<? super R> comparator) {
        reports = (R[]) new Object[INITIAL_SIZE];
        this.comparator = comparator;
    }

    @Override
    public void add(R report) {
        if (index >= reports.length) resize();
        reports[index++] = report;
    }

    @Override
    public R get(int i) {
        return reports[i];
    }

    @Override
    public R[] reports() {
        R[] sorted = Arrays.copyOf(reports, index);
        Arrays.sort(sorted, comparator);

        return sorted;
    }

    private void resize() {
        reports = Arrays.copyOf(reports, reports.length + INITIAL_SIZE);
    }
}
