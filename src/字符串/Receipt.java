package 字符串;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-10s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-10s %5s %10s\n", "----", "----", "----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-10s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal(){
        f.format("%-10s %5s %10s\n", "", "", "----");
        f.format("%-10s %5s %10.2f\n", "total", "", total);
    }

    public static void main(String[] args) {
        Receipt r = new Receipt();
        r.printTitle();
        r.print("Beans",1,2.13);
        r.print("Apple",2,3.24);
        r.printTotal();
    }
}
