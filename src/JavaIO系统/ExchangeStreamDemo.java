package JavaIO系统;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 转换流
 * OutputStreamWriter:  可以将输出的字符流转化为字节流的输出形式
 * InputStreamReader:   将输入的字节流转化为字符流输入形式
 */
public class ExchangeStreamDemo {

    private static void write(OutputStream out) {
        Writer writer = null;

        writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);
        try {
            writer.write("菜鸟想飞！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void read(InputStream in) {
        Reader reader = null;

        reader = new InputStreamReader(in, StandardCharsets.UTF_8);
        char[] chars = new char[1024];
        int len = -1;
        try {
            while ((len = reader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
//        try {
//            InputStream in = new FileInputStream("test.txt");
//            read(in);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        File file = new File("test2.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            write(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
