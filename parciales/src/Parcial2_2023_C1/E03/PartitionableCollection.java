package Parcial2_2023_C1.E03;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionableCollection<T> extends ArrayList<T> {
    public PartitionableCollection() {
        super();
    }

    public PartitionableCollection<T> getSelected(Predicate<T> predicate) {
        return this.stream()
                .filter(predicate)
                .collect(Collectors.toCollection(PartitionableCollection::new));
    }

    public PartitionableCollection<T> getRejected(Predicate<T> predicate) {
        return getSelected(predicate.negate());
    }
}
