import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(13);
        arrayList.add(15);
        myList.add(13);
        System.out.println(myList);
        System.out.println(arrayList);
        arrayList.add(16);
    }
}
