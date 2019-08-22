package 内部类;

public class CherryBlossoms {
    public Flower flower(){
        return new Flower() {
            private String fName = "CherryBlossoms";
            @Override
            public String flowerName() {
                return fName;
            }
        };
    }

    public static void main(String[] args) {
        CherryBlossoms c = new CherryBlossoms();
        Flower flower = c.flower();
    }
}
