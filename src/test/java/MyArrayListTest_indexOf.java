public class MyArrayListTest_indexOf {
    public static void main(String[] args) {
        MyArrayList<String> listString = new MyArrayList<String>();
        listString.add("Mot");
        listString.add("hai");
        listString.add("ba");
        listString.add("bon");
        System.out.println(listString.indexOf("bon"));
        System.out.println(listString.indexOf("mot"));
        System.out.println(listString.indexOf("ba"));

    }
}
