package JavaIO系统;

import java.io.*;

/**
 *打印流：便利输出
 */
public class PrintStreamDemo {

    private static void charPrint() {
        Writer out = null;
        //加缓存
        BufferedWriter bos = null;
        //增强打印功能
        PrintWriter ps = null;
        File file = new File("test5.txt");

        try {
            out = new FileWriter(file);
            bos = new BufferedWriter(out);
            ps = new PrintWriter(bos);
            ps.println("菜鸟想飞！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) ps.close();
        }
    }

    private static void bytePrint() {
        OutputStream out = null;
        //加缓存
        BufferedOutputStream bos = null;
        //增强打印功能
        PrintStream ps = null;
        File file = new File("test5.txt");

        try {
            out = new FileOutputStream(file);
            bos = new BufferedOutputStream(out);
            ps = new PrintStream(bos);
            ps.println("菜鸟想飞！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) ps.close();
        }
    }

    public static void main(String[] args) {
//        bytePrint();
        charPrint();
    }
}
