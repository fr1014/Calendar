package 正则表达式;

import java.util.Arrays;

public class Splitting{

    public static String s = "I think i love you ...";

    public static void split(String regex){
        System.out.println(Arrays.toString(s.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\w+");
        split("\\W+");
        split("i\\W+");
    }
}
