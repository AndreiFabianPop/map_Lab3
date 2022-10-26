package Model.ADT;

import java.util.Stack;

public interface IStack<T> extends Iterable<T> {
    void push(T val);

    T pop() throws Exception;

    T top() throws Exception;

    boolean isEmpty();

    Stack<T> getStack();
}
