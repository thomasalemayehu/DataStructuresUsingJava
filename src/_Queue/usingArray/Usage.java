package _Queue.usingArray;

public class Usage {
    public static void main(String[] args) {
        _QueueUsingArray<Integer> q = new _QueueUsingArray<>(4);

        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println(q);

        q.dequeue();
        System.out.println(q);
    }
}
