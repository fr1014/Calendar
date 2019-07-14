public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
//        this(s);
        this.s = s;
    }

    Flower() {
        this("hi", 47);
    }

    void printPetalCount() {
//        this(11);   除构造器外，编辑器禁止在其他任何方法中调用构造器
        System.out.println("s = " + s +"\n"+ "petalCount = " + petalCount);

    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
