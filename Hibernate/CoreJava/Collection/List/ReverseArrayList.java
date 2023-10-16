package List;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        java.util.Collections.sort(arrayList);
        ListIterator<String> listIterator = arrayList.listIterator(arrayList.size());

        System.out.println("ArrayList in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
