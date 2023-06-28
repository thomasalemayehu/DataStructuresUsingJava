package _Queue.usingArray;

import _Queue._Queue;

import java.util.Arrays;

public class _QueueUsingArray<T> implements _Queue<T> {
    Object [] elements;
    int frontIndex;

    int rearIndex;

    public _QueueUsingArray(){
        frontIndex = -1;
        rearIndex = -1;
        this.elements = new Object[10];
    }

    public _QueueUsingArray(int size){
        frontIndex = -1;
        rearIndex = -1;
        this.elements = new Object[size];
    }
    @Override
    public boolean isEmpty() {
        return rearIndex == -1 && frontIndex == -1;
    }

    @Override
    public int size() {
        return rearIndex - frontIndex +1;
    }

    @Override
    public T front() {
        if(frontIndex == -1) throw new IndexOutOfBoundsException();

        else  return (T) this.elements[frontIndex];

    }

    @Override
    public T enqueue(Object value) {
        this.elements[++rearIndex] = value;

        if(frontIndex == -1){
            frontIndex++;
        }

        return (T)value;
    }

    @Override
    public T dequeue() {
        T lastElem = (T)this.elements[++frontIndex];

        return lastElem;
    }

    @Override
    public  String toString(){
        StringBuilder res = new StringBuilder(" [ ");

        for(int i=frontIndex; i<= rearIndex; i++){
            if(i == rearIndex) res.append(this.elements[i]).append(" ");

            else res.append(this.elements[i]).append(", ");
        }

        res.append(" ] ");

        return res.toString();
    }
}
