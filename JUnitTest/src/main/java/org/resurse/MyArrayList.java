package org.resurse;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MyArrayList {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_SIZE = 10;
    private int capacity;

    public MyArrayList() {
        elements = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public <T> void add(T element) {
        if (size > (elements.length * 0.75)) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    public <T> void addAll(T @NotNull [] array) {
        if (elements.length*0.75 > size+array.length) {
            increaseCapacity();
        }
        for(T element : array) {
            add(element);
            if (size == (elements.length * 0.75)) {
                increaseCapacity();
            }
        }
    }

    public <T> void addAtIndex(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (size == elements.length*0.75) {
            increaseCapacity();
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

    public int getSize() {
        return size;
    }

    public Object getElement(int i) {
        return elements[i];
    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        for(int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public void print() {
        System.out.println("MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", elements.length=" + elements.length +
                '}');
    }


}
