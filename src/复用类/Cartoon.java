package 复用类;

class Art{
    Art(){
        System.out.println("Art Constructor");
    }
}

class Draw extends Art{
    Draw(){
        System.out.println("Draw Constructor");
    }
}

public class Cartoon extends Draw{

    public Cartoon(){
        System.out.println("Cartoon Constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
