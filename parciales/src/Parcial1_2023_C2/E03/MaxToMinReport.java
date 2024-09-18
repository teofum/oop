package Parcial1_2023_C2.E03;

import java.util.Comparator;

public class MaxToMinReport<R> extends MinToMaxReport<R> {
    public MaxToMinReport(Comparator<? super R> comparator) {
        super(comparator.reversed());
    }
}
