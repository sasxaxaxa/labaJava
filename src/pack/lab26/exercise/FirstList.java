package pack.lab26.exercise;

import java.util.Arrays;
import java.util.Iterator;

public class FirstList<Integer> implements Iterable<Integer> {
    private final Integer[] array;
    private final int size;

    public FirstList(Integer[] array) {
        this.array = array;
        this.size = array.length;
    }

    @Override
    public String toString() {
        return "FirstList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {

            private final int index = 0;

            @Override
            public boolean hasNext() {
                return size > index && array[index] != null;
            }

            @Override
            public Integer next() {
                return array[index + 1];
            }

            @Override
            public void remove() {
                if (size != 0) {
                    array[index] = null;
                }
            }
        };
        return it;
    }
}