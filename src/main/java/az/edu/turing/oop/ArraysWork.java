package az.edu.turing.oop;

import java.util.Arrays;

public class ArraysWork {
    private Integer[] elements;
    private int size;

    public ArraysWork() {
        this.elements = new Integer[size];
        this.size = 0;
    }

    public void addElement(int element) {
        elements = Arrays.copyOf(elements, size + 1);
        elements[size++] = element;
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.length){
            Integer[] newElements = new Integer[elements.length - 1];
            for (int i = 0, k = 0; i < size; i++) {
                if (i == index) {
                    continue;
                }
                newElements[k++] = elements[i];
            }
            size--;
            elements = newElements;
        }
    }

    @Override
    public String toString() {
        return "ArraysWork{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}

