package _Queue;

public interface _Queue<T> {
    boolean isEmpty();

    int size();

    T front();

    T enqueue(T value);

    T dequeue();
}
