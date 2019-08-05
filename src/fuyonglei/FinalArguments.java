package fuyonglei;

class Args{
    public void arg(){

    }
}

public class FinalArguments {
    void with(final Args args){
//        args = new Args();       Error:args is final
    }

    void without(Args args){
        args = new Args();
        args.arg();
    }

    void f(final int i){
//        i++;              Error:can't change,i is final
    }

    //final类型的参数只可以读,无法修改参数
    int g(final int i){
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments finalArguments = new FinalArguments();
        finalArguments.without(null);
        finalArguments.with(null);
        System.out.println(finalArguments.g(1));
    }
}
