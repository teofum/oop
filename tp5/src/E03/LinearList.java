package E03;

public interface LinearList<T> {
    void add(T elem);

    T get(int i);

    void set(int i, T elem);

    void remove(int i);

    int indexOf(T elem);

    int size();
}
