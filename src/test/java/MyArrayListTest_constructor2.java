import java.util.Collection;
import java.util.LinkedList;

public class MyArrayListTest_constructor2 {
    public static void main(String[] args) {

        Collection<String> collection= new LinkedList<String>();
        collection.add("muoi mot");
        collection.add("muoi hai");
        collection.add("muoi ba");
        System.out.println(collection);

        MyArrayList<String> myArrayList2= new MyArrayList<String>(collection);
        System.out.println(myArrayList2);
    }
}
