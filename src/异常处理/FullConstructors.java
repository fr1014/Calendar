package 异常处理;

class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void h() throws MyException {
        System.out.println("Throwing MyException from h()");
        throw new MyException("Originated in h()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }

        try {
            h();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
