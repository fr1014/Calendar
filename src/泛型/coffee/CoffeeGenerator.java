package 泛型.coffee;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>{

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class};

    private static Random rand = new Random(47);

    public CoffeeGenerator() {
    }

    private int size;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 3; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeeGenerator(3)) {
            System.out.println(c);
        }
    }
}
