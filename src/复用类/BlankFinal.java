package 复用类;

class Poppet {
    public int i;

    Poppet(int ii) {
        i = ii;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
        System.out.println("j = " + j + ",p.i =" + p.i);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
        System.out.println("j = " + j + ",p.i =" + p.i);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(2);
    }
}
