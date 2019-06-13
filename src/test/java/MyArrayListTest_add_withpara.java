public class MyArrayListTest_add_withpara {
    public static void main(String[] args) {
        MyArrayList<String> listString= new MyArrayList<String>();
        listString.add("Mot");
        listString.add("hai");
        listString.add("ba");
        listString.add("bon");
        System.out.println(listString);
        listString.add(-1,"muoi");
    }
}
