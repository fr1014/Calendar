package JavaIO系统;

import java.io.*;

/**
 * 缓存的目的：解决在写入文件操作时，频繁的操作文件所带来的性能降低的问题
 * BufferedOutputStream 内存默认的缓存大小是8KB,每次写入时存储到缓存中的byte数组中，
 * 当数组存满时，会把数组中的数据写入文件，并且缓存的byte数组下标归零。
 */
public class BufferStreamDemo {

    private static void charWriter() {
        Writer writer = null;
        BufferedWriter bw = null;
        File file = new File("test4.txt");

        try {
            writer = new FileWriter(file);
            bw = new BufferedWriter(writer);

            String info = "菜鸟想飞";
            bw.write(info);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void charReader() {
        Reader reader = null;
        BufferedReader br = null;
        File file = new File("test4.txt");
        try {
            reader = new FileReader(file);
            //为字符流提供缓冲，达到高效读取的目的
            br = new BufferedReader(reader);
            char[] chars = new char[1024];
            int len = -1;
            while ((len = br.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void byteReader() {
        FileInputStream in = null;
        BufferedInputStream bis = null;
        File file = new File("test3.txt");

        try {
            in = new FileInputStream(file);
            bis = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void byteWrite() {
        FileOutputStream out = null;
        BufferedOutputStream bos = null;
        File file = new File("test3.txt");
        try {
            out = new FileOutputStream(file);
            //构建一个字节缓冲流
            bos = new BufferedOutputStream(out);
            String info = "菜鸟想飞";
            bos.write(info.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) bos.close();
//                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        byteWrite();
//        byteReader();
        charWriter();
//        charReader();
    }
}
