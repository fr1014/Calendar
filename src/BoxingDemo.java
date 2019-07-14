public class BoxingDemo {

    public static void main(String[] args){
        GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
        m.write(37);
        System.out.println(m.read());
    }

}
