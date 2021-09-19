package l2;

public interface LinkedList<E> extends List<E>  {

    void insertFirst(E value);

    E removeFirst();

    int size();

    boolean isEmpty();

    E getFirst();

    class Node<E> {
        E item;
        Node<E> next;
        Node<E> previous;

        public Node(E item, Node<E> next) {
            this(item, next, null);
        }

        public Node(E item, Node<E> next, Node<E> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }
}
