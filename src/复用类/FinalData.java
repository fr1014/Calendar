package 复用类;

import java.util.Random;

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 29;
    public static final int VALUE_THREE = 39;
    private final int ir = random.nextInt(20);
    static final int INT = random.nextInt(20);
    private Value v1 = new Value(1);
    private final Value v2 = new Value(2);
    private static final Value V3 = new Value(3);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", ir=" + ir + ", INT =" + INT +
                '}';
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
//        fd1.valueOne++;   //Error:valueOne为final,值不能改变
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++;

//        fd1.v2 = new Value(0);    //Error
//        fd1.a = new int[3];       //Error
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
