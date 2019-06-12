import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private int DEFAULT_CAPACITY=3;
    private Object[] elements;

    MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }


    private void ensureCapa(){
        int newSize= elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        elements[size++]=e;
        if(size==elements.length){
            ensureCapa();
        }

    }

    public E get(int i){
        if((i>=size)||(i<0)){
            throw new IndexOutOfBoundsException("Index: " +i);
        }
        return (E)elements[i];
    }
}
