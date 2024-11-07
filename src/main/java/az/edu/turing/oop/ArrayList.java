package az.edu.turing.oop;

import java.util.Arrays;

public class ArrayList<T> {

    Object[] elements;
    int index = 0;
    private static final Integer defaultCapacity = 10;

    public ArrayList() {
        elements = new ArrayList[defaultCapacity];
    }

    public void addTail(T t) {
        if (index == elements.length) {
            resize();
        }
        elements[index++] = t;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
