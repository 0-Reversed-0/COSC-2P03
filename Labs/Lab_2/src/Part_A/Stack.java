package Part_A;

public interface Stack <A>
{
    public void push(A element);
    public A pop() throws EmptyStackException;
    public A peek() throws EmptyStackException;
    public boolean isEmpty();
    public int size();
}
