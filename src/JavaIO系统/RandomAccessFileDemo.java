package JavaIO系统;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

    public static void main(String[] args) {
        //读取文件
        RandomAccessFile r = null;
        //写入文件
        RandomAccessFile w = null;
        try {
            r = new RandomAccessFile("test4.txt", "r");
            w = new RandomAccessFile("randomFile.txt", "rw");
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = r.read(bytes)) != -1) {
                w.write(bytes, 0, len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (w != null) w.close();
                if (r != null) r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
