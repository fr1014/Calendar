package JavaIO系统;

import java.io.*;

public class ObjectStreamDemo {

    /**
     * 反序列化的过程
     * 把文件中的内容读取出来，还原成对象
     */
    private static void readObject() {
        File file = new File("cat.obj");
        ObjectInputStream ois = null;

        try {
            InputStream in = new FileInputStream(file);
            ois = new ObjectInputStream(in);
            Cat cat = (Cat) ois.readObject();
            System.out.println(cat);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 对象序列化的过程
     * 把对象写入文件：实际写入的是类名、属性名、属性类型、属性的值等
     */
    private static void writeObject() {
        Cat cat = new Cat(1,"Tom", 19, "man");
        File file = new File("cat.obj");
        ObjectOutputStream oos = null;
        try {
            OutputStream out = new FileOutputStream(file);
            oos = new ObjectOutputStream(out);
            oos.writeObject(cat);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        readObject();
//        writeObject();
    }
}