package 正则表达式;

public class Replacing {
    public static String s = "I think i love you ...";

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("l\\w+","like"));
        System.out.println(s.replace("love","like"));
        System.out.println(s.replaceAll("I|love","like"));
    }
}
