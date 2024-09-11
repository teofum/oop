package E03;

public class Node<T> {
    private T elem;
    private Node<T> next;

    public Node(T elem) {
        this.elem = elem;
        this.next = null;
    }

    public T get() {
        return elem;
    }

    public void set(T elem) {
        this.elem = elem;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
