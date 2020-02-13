package GenericSwapMethodString;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T> {
    private ArrayList<T> arr = new ArrayList<>();

    public void add (T element) {
        this.arr.add(element);
    }


    public void print () {
        arr.stream().forEach(e -> System.out.println("java.lang.String: " + e));
    }

    public void set(int index, int index1) {
        Collections.swap(arr,index, index1);


    }
}
