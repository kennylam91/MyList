import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
public class MyArrayListTest_trimToSize {
    public static void main(String[] args) {
        MyArrayList<String> listString= new MyArrayList<String>(10);
        listString.add("Mot");
        listString.add("hai");
        listString.add("ba");
        listString.add("bon");
        System.out.println(listString);

        listString.trimToSize();
        System.out.println(listString);

        MyArrayList<Integer> listInteger = new MyArrayList<Integer>(0);
        listInteger.trimToSize();
        System.out.println(listInteger);

    }
}
