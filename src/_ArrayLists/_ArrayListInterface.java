package _ArrayLists;

import java.util.Collection;
import java.util.List;

public interface _ArrayListInterface<T> {
    int size();
    boolean isEmpty();
    void grow();

    void add(T value);
    void addAll(Collection<T> values);

    void set(int index, T value);

    T get(int index);

    boolean contains(T value);

    int indexOf(T value);

    int lastIndexOf(T value);

    boolean remove(T value);

    boolean removeAll(Collection<? extends T> values);

    T[] toArray();

    boolean equals(List<T> other);

}


