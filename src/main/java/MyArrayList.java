import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;


public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];

        } else {
            throw new IllegalArgumentException("capacity" + capacity);

        }

    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }

    private boolean isIndexValid(int index) {
        return ((index >= 0) && (index < size));
    }

    public MyArrayList(Collection<? extends E> c) {
        elements = c.toArray();
        size = c.toArray().length;

    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
        return true;

    }

    public E get(int i) {
        if ((i >= size) || (i < 0)) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        return (E) elements[i];
    }

    public void trimToSize() {
        elements = Arrays.copyOf(elements, size);

    }

    public int size() {
        return size;
    }

    public void add(int index, E e) {
        if (isIndexValid(index)) {
            Object[] temp = Arrays.copyOf(elements, size);
            for (int i = index; i < size; i++) {
                elements[i + 1] = temp[i];
            }
            elements[index] = e;
            size++;
        } else {
            throw new IndexOutOfBoundsException("index is Invalid " + index);
        }
    }

    public E remove(int index) {
        if (isIndexValid(index)) {
            Object[] temp = Arrays.copyOf(elements, size);
            for (int i = index; i < size - 1; i++) {
                elements[i] = temp[i + 1];
            }
            elements[size - 1] = null;
            size--;
            return (E) temp[index];
        } else {
            throw new IndexOutOfBoundsException("index is Invalid " + index);
        }
    }

    public Object clone() {
        MyArrayList<String> object = new MyArrayList();
        object.setElements(this.getElements());
        object.setSize(this.getSize());
        return object;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) return i;
        }
        return -1;
    }

    public void clear(){
        elements=new Array[0];
        size=0;

    }

}
