package 内部类;

public class Sunflower {

    public FlowerName getFlowerName(String name){
        return new FlowerName(name) {
            @Override
            public void flowerName() {
                System.out.println("flowerName()");
            }
        };
    }

    public static void main(String[] args) {
        Sunflower s = new Sunflower();
        FlowerName fn = s.getFlowerName("sunflower");
        fn.flowerName();
    }
}
