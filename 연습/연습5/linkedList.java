package 연습.연습5;
import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>(10);

        linkList.add("cat");
        linkList.add("cuty");
        linkList.add("lovely");

        arrayList.add("lovely");
        arrayList.add("cat");
        arrayList.add("cuty");


        int linkSize = linkList.size();
        int arraySize = arrayList.size();

        System.out.println(linkSize);
        System.out.println(linkList.get(0));
        System.out.println(linkList.get(2));
        System.out.println(arrayList.get(2));


        System.out.println(arraySize);

    }
}
