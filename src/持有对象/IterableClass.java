package 持有对象;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] words = ("I Love You").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.print(s + " ");
        }
    }
}
