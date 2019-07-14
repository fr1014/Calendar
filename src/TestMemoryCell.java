public class TestMemoryCell {

//    public static void main(String[] args){
//        MemoryCell m = new MemoryCell();
//        m.Write("测试");
//        String var = (String) m.read();
//        System.out.println(var);
//    }

//    public static void main(String[] args){
//        MemoryCell m = new MemoryCell();
//        m.Write(37);
////        Integer wrapperVal = (Integer) m.read();
//        int var = (int) m.read();
//        System.out.println(var);
//    }

    public static void main(String[] args){
        MemoryCell m = new MemoryCell();
        m.write(37);
        System.out.println(m.read());
    }
}
