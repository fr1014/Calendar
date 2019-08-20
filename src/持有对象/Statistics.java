package 持有对象;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int r = rand.nextInt(10);
            Integer count = map.get(r);
            map.put(r, count == null ? 1 : count + 1);
        }

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
