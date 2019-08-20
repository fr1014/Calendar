package neibulei;

public class Gypsophila {
    public Flower flower(final String name,final float price){
        return new Flower() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100){
                    System.out.println("Over budget!");
                }
            }
            private String fName = name;
            @Override
            public String flowerName() {
                return name;
            }
        };
    }

    public static void main(String[] args) {
        Gypsophila g = new Gypsophila();
        Flower f = g.flower("Gypsophila",101.44f);
        f.flowerName();
    }
}
