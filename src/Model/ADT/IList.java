package Model.ADT;

import java.util.List;

public interface IList<T> extends Iterable<T> {
    void add(T val);

    void remove(T val) throws Exception; // TODO ex

    void remove(int index) throws Exception;

    T get(int index);

    boolean isEmpty();

    List<T> getList();

    String toString();
}
