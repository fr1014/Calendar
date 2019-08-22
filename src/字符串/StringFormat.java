package 字符串;

public class StringFormat {

    private String format(String name,int x,int y){
        return String.format("%s is at (%d,%d)",name,x,y);
    }

    public static void main(String[] args) {
        StringFormat sf = new StringFormat();
        System.out.println(sf.format("Tom",1,4));
    }
}
