package 持有对象;

import java.util.*;

public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] mooreInts = {6, 7, 8, 9, 10};
//        collection.addAll(Arrays.asList(mooreInts));
//        Collections.addAll(collection, mooreInts);
        Collections.addAll(collection, 6, 7, 8, 9, 10);
        System.out.print("collection: ");
        for (Integer integer : collection) {
            System.out.print(integer + " ");
        }

        List<Integer> list = Arrays.asList(11, 12, 13, 14, 15);
        list.set(0, 1);
//        list.add(16);     Runtime error
        System.out.print("\nlist: ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
