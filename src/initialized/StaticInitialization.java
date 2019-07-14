package initialized;

class Bowl{
    Bowl(int test){
        System.out.println("Bowl("+test+")");
    }

    void f1(int test){
        System.out.println("f1("+test+")");
    }
}

class Table{
    static Bowl bowl1 = new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int test){
        System.out.println("f2("+test+")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int test){
        System.out.println("f3("+test+")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard in main");
        new Cupboard();
        System.out.println("Creating new Cupboard in main");
        new Cupboard();
//        table.f2(1);
        cupboard.f3(1);
        System.out.println("test");
        Bowl bowl = Table.bowl1;
    }

//    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
