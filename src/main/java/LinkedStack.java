public class LinkedStack<T> implements Stack<T> {
    private Node<T> head;

    public LinkedStack(T i) {

    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element, head);
        head = newNode;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T lastValue = head.value;
        head = head.next;
        return lastValue;
    }

    @Override
    public T peek() {
        return isEmpty() ? null : head.value;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    private class Node<R> {
        R value;
        Node<R> next;

        public Node(R value, Node<R> next) {
            this.value = value;
            this.next = next;
        }
    }
}
