package 泛型;

class Cat{}

public class Animal<T> {
    private T t;

    public Animal(T t){
        this.t = t;
    }

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Animal<Cat> animal = new Animal<>(new Cat());
        Cat cat = animal.get();
    }
}
