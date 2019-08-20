package 持有对象;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

public class Apples {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());

        for (Apple apple : apples)
            System.out.println(apple.id());
    }
}
