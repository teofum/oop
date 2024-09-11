package E03;

public class LinkedList<T> implements LinearList<T> {
    private Node<T> head, last;

    private static class Node<T> {
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
    }

    public LinkedList() {
        this.head = null;
        this.last = null;
    }

    @Override
    public void add(T elem) {
        Node<T> newNode = new Node<>(elem);
        if (this.last != null) {
            this.last.setNext(newNode);
        } else {
            this.head = newNode;
        }
        this.last = newNode;
    }

    @Override
    public T get(int i) {
        return find(i).get();
    }

    @Override
    public void set(int i, T elem) {
        find(i).set(elem);
    }

    @Override
    public void remove(int i) {
        Node<T> last = null;
        Node<T> node = this.head;
        while (i > 0 && node != null) {
            last = node;
            node = node.getNext();
            i--;
        }
        if (node == null) throw new IndexOutOfBoundsException();

        if (node == this.last)
            this.last = last;

        if (last == null) {
            this.head = node.getNext();
            node.setNext(null);
        } else {
            last.setNext(node.getNext());
            node.setNext(null);
        }
    }

    @Override
    public int indexOf(T elem) {
        Node<T> node = this.head;
        int i = 0;
        while (node != null) {
            if (node.get().equals(elem)) return i;
            node = node.getNext();
            i++;
        }

        return -1;
    }

    @Override
    public int size() {
        Node<T> node = this.head;
        int i = 0;
        while (node != null) {
            node = node.getNext();
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> node = this.head;
        while (node != null) {
            sb.append(node.get().toString());
            node = node.getNext();
            if (node != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private Node<T> find(int i) {
        Node<T> node = this.head;
        while (i > 0 && node != null) {
            node = node.getNext();
            i--;
        }

        if (node == null) throw new IndexOutOfBoundsException();
        return node;
    }
}
