package fuyonglei;

class Animal {
    public void run() {
    }

    static void fly(Animal animal) {
        animal.run();
    }
}

public class Bird extends Animal {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal.fly(bird);
    }
}
