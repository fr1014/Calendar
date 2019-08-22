package 字符串;

public class SimpleFormat {

    public static void main(String[] args) {
        int x = 3;
        double y = 3.141592;
        System.out.println("Row 1: [" + x + "," + y + "]");
        System.out.format("Row 2: [%d,%f]\n", x, y);
        System.out.printf("Row 3: [%d,%f]\n",x,y);
    }
}
