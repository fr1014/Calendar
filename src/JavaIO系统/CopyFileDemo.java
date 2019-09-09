package JavaIO系统;

import java.io.*;

/**
 * 复制文件
 * 从一个输入流中读取数据，然后通过输出流写入目标文件
 */
public class CopyFileDemo {

    public static void main(String[] args) {
        copy("test.txt","test1.txt");
        System.out.println("copy success!");
    }

    /**
     * @param src    原文件
     * @param target 目标文件
     */
    private static void copy(String src, String target) {
        File srcFile = new File(src);
        File targetFile = new File(target);
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(targetFile);

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
