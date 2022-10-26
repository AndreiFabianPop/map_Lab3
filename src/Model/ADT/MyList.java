package Model.ADT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MyList<T> implements IList<T>{
    private final ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<T>();
    }

    public MyList(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    public void add(T val) {
        this.list.add(val);
    }

    @Override
    public void remove(T val) throws Exception {
        if (!this.list.remove(val))
            throw new Exception("ERROR: No such element in list.");
    }

    @Override
    public void remove(int index) throws Exception {
        if (index < 0 || index >= this.list.size())
            throw new Exception("ERROR: No such element in list.");
        this.list.remove(index);
    }

    @Override
    public T get(int index) {
        return this.list.get(index);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public java.util.List<T> getList() {
        return this.list;
    }

    @Override
    public Iterator<T> iterator() {
        return this.list.listIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        IList.super.forEach(action);
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
