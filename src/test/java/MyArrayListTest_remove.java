public class MyArrayListTest_remove {
    public static void main(String[] args) {
        MyArrayList<String> listString= new MyArrayList<String>();
        listString.add("Mot");
        listString.add("hai");
        listString.add("ba");
        listString.add("bon");
        System.out.println(listString);
        listString.remove(0);
    }
}
