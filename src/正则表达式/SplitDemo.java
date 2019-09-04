package 正则表达式;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "I think!!i!!love!!you";
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
    }
}
