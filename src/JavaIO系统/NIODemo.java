package JavaIO系统;

import java.nio.ByteBuffer;

public class NIODemo {

    public static void main(String[] args) {
        //创建一个字节缓冲区，申请内存空间为8字节
        ByteBuffer buf = ByteBuffer.allocate(8);

        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        System.out.println("----------");

        //向缓冲区中写入数据
        buf.put((byte) 10);
        buf.put((byte) 20);
        buf.put((byte) 30);
        buf.put((byte) 40);

        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

    }
}
