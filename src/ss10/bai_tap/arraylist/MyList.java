package ss10.bai_tap.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void addd(int index, E element) {
        for (int i = 0; i < size + 1; i++) {
            if (i == index) {
                for (int j = size + 1; j > i; j--) {
                    elements[j] = elements[j - 1];
                }
                elements[i] = element;
                size++;
            }
        }
    }

    public void remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                for (int j = i; j < size-1; j++) {
                    elements[j] = elements[j+1];
                }
            }
        }
        elements[size] = null;
        size--;
    }


    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }


    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

}
