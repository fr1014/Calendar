package initialized;

class Cup {
    Cup(int test) {
        System.out.println("Cup(" + test + ")");
    }

    void f(int test) {
        System.out.println("f(" + test + ")");
    }

}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups(){
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(1);
    }
//    static Cups cups = new Cups();
}
