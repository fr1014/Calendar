package 持有对象;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
//        Set<Integer> intSet = new HashSet<>();
//        Set<Integer> intSet = new TreeSet<>();
        Set<Integer> intSet = new LinkedHashSet<>();
        for (int i = 0; i < 1000; i++) {
            int it = rand.nextInt(30);
            intSet.add(it);
        }
        System.out.println(intSet);
    }
}
