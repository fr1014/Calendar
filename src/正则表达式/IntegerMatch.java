package 正则表达式;

public class IntegerMatch {

    public static void main(String[] args) {
        System.out.println("-123".matches("-?\\d+"));
        System.out.println("456".matches("-?\\d+"));
        System.out.println("+789".matches("-?\\d+"));
        System.out.println("+789".matches("(-|\\+)?\\d+"));
    }
}
