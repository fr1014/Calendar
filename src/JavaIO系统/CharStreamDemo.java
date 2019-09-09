package JavaIO系统;

import java.io.*;

/**
 * 字符流：
 * 字符输出流：Writer，对文件的操作使用子类：FileWriter
 * 字符输入流：Reader,对文件的操作使用子类：FileReader
 * 每次操作的单位是一个字符
 *
 * 文件字符操作流会自带缓存，默认大小为1024字节，在缓存满后，或手动刷新，或关闭流时会把数据写入文件
 *
 * 如何选择使用字节流还是字符流
 * 一般操作非文件时，使用字节流（如图片或者视频），操作文本文件时建议使用字符流
 *
 * 字符流的内部实现还是字节流
 */
public class CharStreamDemo {

    private static void in() {
        Reader reader = null;
        File file = new File("test.txt");
        try {
            reader = new FileReader(file);
            char[] chars = new char[1];
            int len = -1;
            StringBuilder sb = new StringBuilder();
            while ((len = reader.read(chars)) != -1) {
                sb.append(new String(chars,0,len));
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void out() {
        Writer writer = null;
        File file = new File("test.txt");
        try {
            writer = new FileWriter(file,true);
            writer.write("菜鸟想飞\n");
            System.out.println("Write Success!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        }
    }

    public static void main(String[] args) {
        out();
        in();
    }
}
