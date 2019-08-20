package 持有对象;

import java.util.*;

public class PrintingContainers {

    private static void print(Object o){
        System.out.println(o);
    }

    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("cat");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("rat","Jerry");
        map.put("cat","TomCat");
        map.put("cat","Tom");
        map.put("dog","Spike");
        return map;
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new HashMap<String,String>()));
        print(fill(new TreeMap<String,String>()));
        print(fill(new LinkedHashMap<String,String>()));
    }
}
