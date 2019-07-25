package initialized;

public class SimpleEnumUse {

    public static void main(String[] args) {
        Spiciness howHot = Spiciness.HOT;
        System.out.println(howHot);
    }

    public enum Spiciness {
        NOT, MILD, MEDIUM, HOT, FLAMING
    }

}

class EnumOrder {
    public static void main(String[] args) {
        for (SimpleEnumUse.Spiciness s : SimpleEnumUse.Spiciness.values()) {
            System.out.println(s + ",ordinal：" + s.ordinal());
        }
    }
}

class SwitchTest {
    SimpleEnumUse.Spiciness degree;

    public SwitchTest(SimpleEnumUse.Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.println("This degree is ");
        switch (degree) {
            case NOT:
                System.out.println("not");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("medium");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("hot");
        }
    }

    public static void main(String[] args) {
        SwitchTest not, medium, hot;
        not = new SwitchTest(SimpleEnumUse.Spiciness.NOT);
        medium = new SwitchTest(SimpleEnumUse.Spiciness.MEDIUM);
        hot = new SwitchTest(SimpleEnumUse.Spiciness.HOT);
        not.describe();
        medium.describe();
        hot.describe();
    }
}