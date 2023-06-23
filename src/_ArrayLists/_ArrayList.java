package _ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _ArrayList<T> implements _ArrayListInterface<T> {
    private Object[] elements;

    private int currentLastElementPointer;

    private int initiationSize = 1;

    private int growFactor = 1;

    public _ArrayList(int initiationSize, int growFactor){
        this();
        this.initiationSize = initiationSize;
        this.growFactor = growFactor;
    }

    public _ArrayList(int initiationSize){
        this();
        this.initiationSize = initiationSize;
    }

    public _ArrayList(){
        elements = new Object[initiationSize];
        currentLastElementPointer = 0;
    }


    @Override
    public int size() {
        return currentLastElementPointer;
    }

    @Override
    public boolean isEmpty() {
        return currentLastElementPointer == 0;
    }

    private void copyElements(Object[] newList){
        for(int index =0; index<this.elements.length; index++)
            newList[index] =this.elements[index];
    }

    @Override
    public void grow() {
        Object[] newList = new Object[elements.length  + growFactor];
        copyElements(newList);
        this.elements = newList;
    }

    @Override
    public void add(T value) {
        if(currentLastElementPointer == this.elements.length)
            this.grow();

        this.elements[this.currentLastElementPointer++] = value;
    }

    @Override
    public void addAll(Collection<T> values) {
            for(T val:values){
                this.add(val);
            }
    }

    @Override
    public void set(int index, T value) {
            if(index > this.currentLastElementPointer) throw new IndexOutOfBoundsException(
                    String.format("_ArrayList: Index %d out of bounds for _ArrayList of " +
                            " size %d",index,this.currentLastElementPointer)
                    );

            this.elements[index] = value;
    }

    @Override
    public T get(int index) {

        if(index > this.currentLastElementPointer ){
            throw new IndexOutOfBoundsException
                    (String.format("_ArrayList: Index %d out of bounds for _ArrayList of" +
                            " size %d",index,currentLastElementPointer)
                    );
        }
        return (T) this.elements[index];
    }

    @Override
    public boolean contains(Object value) {
        if(value == null) throw new NullPointerException("Null value used in method contains");

        for(Object current:this.elements){
            if(current.equals(value)) return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        if(value == null) throw new NullPointerException("Null value used in method contains");
        int index = -1;

        for(int trackIndex =0; trackIndex<this.elements.length; trackIndex++){
            if(this.elements[trackIndex].equals(value)){
                index = trackIndex;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(T value) {
        if(value == null) throw new NullPointerException("Null value used in method contains");
        int index = -1;

        for(int trackIndex =0; trackIndex<this.elements.length; trackIndex++){
            if(this.elements[trackIndex].equals(value)){
                index = trackIndex;
            }
        }
        return index;
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<? extends T> values) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public boolean equals(List<T> other) {
        return false;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder("[ ");

        for(int index = 0; index<this.currentLastElementPointer; index++){
            res.append(this.elements[index]);

            if(index != this.currentLastElementPointer-1) res.append(", ");
        }

        return res.append(" ]").toString();
    }
}
