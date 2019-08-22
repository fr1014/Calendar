package 内部类;

class MNA {
    private void f() {
        System.out.println("f()");
    }

    class A {
        private void g() {
            System.out.println("g()");
        }

        public class B {
            void h() {
                System.out.println("h()");
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnna = mna.new A();
        MNA.A.B mnnab = mnna.new B();
        mnnab.h();
    }
}
