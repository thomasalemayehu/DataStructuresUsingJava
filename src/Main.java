import _ArrayLists._ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        _ArrayList<Integer> values = new _ArrayList<>();
        values.add(3);
        values.add(6);


        values.addAll(Arrays.asList(7,8,9));
        values.set(0,4);

        System.out.println(values);

        values.set(4,16);
        System.out.println(values);
    }
}