package ex_4_ArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        elements = new Object[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (size == elements.length*0.75) {
            increaseCapacity();
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size++] = element;
    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        for(int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public void addAll(int[] array) {
        for (int element : array) {
            add(element);
        }
    }

    public void addAtIndex(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void clear() {
        size = 0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
