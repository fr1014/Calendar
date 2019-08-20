package neibulei;

/**
 * 一个定义在方法中的类（局部内部类）
 */
public class Rose {

    private Flower name(String s) {

        class FName implements Flower {
            private String flower;

            private FName(String s) {
                flower = s;
            }

            @Override
            public String flowerName() {
                return flower;
            }
        }
        return new FName(s);
    }

    public static void main(String[] args) {
        Rose r = new Rose();
        r.name("rose");
    }
}
