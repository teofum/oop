package Parcial1_2023_C2.E03;

public interface ReportCollection<R> {
    void add(R report);

    R get(int index);

    R[] reports();
}
