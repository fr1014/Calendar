package 字符串;

import java.io.PrintStream;
import java.util.Formatter;

public class Tom {
    private String name;

    private Formatter f;

    public Tom(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s And Tom is at (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream out = System.out;
        Tom jerry = new Tom("Jerry",new Formatter(System.out));
        Tom spike = new Tom("Spike",new Formatter(out));
        jerry.move(0,0);
        spike.move(1,1);
        jerry.move(1,2);
        spike.move(2,1);
    }
}
