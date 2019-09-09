package JavaIO系统;

import java.io.*;

/**
 * 字节输出输入流
 * 输出流：超类OutputStream,对文件的输出流使用子类FileOutputStream
 * 输入流：超类InputStream,对文件的输入流使用子类FileInputStream
 *
 * 输入、输出字节流操作原理，每次只会操作一个字节（从文件中读取或写入）
 *
 * 字节操作流、默认首次执行写入操作会直接把数据写入文件
 */
public class ByteStreamDemo {

    private static void in() {
        InputStream is = null;
        //确定目标文件
        File file = new File("test.txt");
        try {
            //构建一个文件输入流对象
            is = new FileInputStream(file);
            //1024字节 = 1KB
            byte[] bytes = new byte[6];
            StringBuilder sb = new StringBuilder();
            //表示每次读取的字节长度
            int len = -1;
            /**
             * 把数据读入到数组中，并返回读取的字节数，
             * 当!=-1时，表示读取到数据，当==-1时，表示文件已经读完
             */
            while ((len = is.read(bytes)) != -1) {
                //根据读取到的字节数组，再转化为字符串内容，添加到StringBuilder中
                sb.append(new String(bytes,0,len));
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    //关闭输入流
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void out() {
        OutputStream os = null;
        //1.确定文件目标
        File file = new File("test.txt");
        // 2.构建一个文件输出对象
        try {
//            os = new FileOutputStream(file);
            os = new FileOutputStream(file, true);    //append为true，写入内容叠加
            //3.输出的内容
            String info = "菜鸟想飞\n";
            //4.把内容写入到文件
            os.write(info.getBytes());
            System.out.println("write success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭流
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        out();
        in();
    }
}
