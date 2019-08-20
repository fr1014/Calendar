package 持有对象;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(10));
        }
        QueueDemo.printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(14, 12, 13, 15, 17, 16);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(ints.size(), Comparator.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String string = "I Love You";
        List<String> strings = Arrays.asList(string.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<>(strings.size(), Comparator.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<>();
        for (char c : string.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> charPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQ(charPQ);
    }
}
