public class MyArrayListTest_contains {
    public static void main(String[] args) {
        MyArrayList<String> listString = new MyArrayList<String>();
        listString.add("Mot");
        listString.add("hai");
        listString.add("ba");
        listString.add("bon");
        System.out.println(listString);
        System.out.println(listString.contains("nam"));
        System.out.println(listString.contains("Mot"));
        System.out.println(listString.contains("ba"));
    }
}
