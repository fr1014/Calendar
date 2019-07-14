package initialized;

class Window {
    Window(int test) {
        System.out.println("window(" + test + ")");
    }
}

public class InitialValues {

    Window w1 = new Window(1);

    InitialValues() {
        System.out.println("InitialValues()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void print() {
        System.out.println("print()");
    }

    Window w3 = new Window(3);

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        initialValues.print();
    }
}
