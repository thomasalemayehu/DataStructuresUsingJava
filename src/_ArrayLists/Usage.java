package _ArrayLists;

import java.util.Arrays;

public class Usage {
    public static void main(String[] args) {

        _ArrayList<Integer> values = new _ArrayList<>();
        values.add(3);
        values.add(6);

//
        values.addAll(Arrays.asList(7,8,9,7));
//        values.set(0,4);
//
//        System.out.println(values);
//
//        values.set(4,16);
//        values.removeAtIndex(1);
        values.removeAll(Arrays.asList(7,8,9,7));

        _ArrayList<Integer> newVals = new _ArrayList<>();
        newVals.add(3);
        newVals.add(6);
        System.out.println(values.equals(newVals));
    }
}