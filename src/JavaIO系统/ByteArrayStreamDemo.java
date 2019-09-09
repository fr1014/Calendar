package JavaIO系统;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * 字节数组流：
 * 基于内存操作，内部维护着一个字节数组，我们可以利用流的读取机制来处理字符串
 * 无需关闭
 */
public class ByteArrayStreamDemo {

    private static void byteArray() {
        String s = "21235ssdffrFGTRG@#%%%";
        ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int curr = -1;//每次读取的字节
        while ((curr = bais.read()) != -1) {
            if ((curr >= 65&&curr<=99)||(curr>=97&&curr<=122)){
                baos.write(curr);
            }
        }
        //此处无需关闭，因为字节数组是基于内存的操作流，与文件无关
        System.out.println(baos.toString());
    }

    public static void main(String[] args) {
        byteArray();
    }
}
