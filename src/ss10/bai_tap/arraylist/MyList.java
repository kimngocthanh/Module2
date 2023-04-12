package ss10.bai_tap.arraylist;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int capacity;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements =(Object[]) new Object[capacity];
    }

    public void add(int index, E element) {
        capacity +=1;
    }


}
