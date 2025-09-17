package Part_A;

import java.util.LinkedList;

public class LinkedStack<A> implements Stack<A> {

    LinkedList<A> list = new LinkedList<>();
    int size;

    public void push(A element) {
        list.add(element);
        size++;
    }

    public A pop() throws EmptyStackException {
        A element = list.removeLast();
        size--;
        return element;
    }

    public A peek() throws EmptyStackException {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return size;
    }
}
