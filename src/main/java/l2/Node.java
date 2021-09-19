package l2;

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
