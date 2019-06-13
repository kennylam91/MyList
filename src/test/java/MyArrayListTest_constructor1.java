import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyArrayListTest_constructor1 {
    public static void main(String[] args) {
        MyArrayList<String> listString= new MyArrayList<String>(10);
        listString.add("Mot");
        listString.add("hai");
        listString.add("ba");
        listString.add("bon");
        System.out.println(listString);



    }
}
