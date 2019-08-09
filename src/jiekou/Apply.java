package jiekou;

import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getName();
    }
    Object process(Object input){
        return input;
    }
}

class Uppercase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DownCase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "I love you";

    public static void main(String[] args) {
        process(new Uppercase(),s);
        process(new DownCase(),s);
        process(new Splitter(),s);
    }
}
