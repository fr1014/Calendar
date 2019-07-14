package initialized;

class Mug{
    Mug(int test){
        System.out.println("Mug("+test+")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;

    Mugs(){
        System.out.println("Mugs()");
    }

    Mugs(int test){
        System.out.println("Mugs("+test+")");
    }

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
