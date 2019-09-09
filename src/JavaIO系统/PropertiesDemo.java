package JavaIO系统;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {

    private static String version = "";
    private static String name = "";
    private static String password = "";

    //静态代码块，只会执行一次
    static {
//        readConfig();
    }

    private static void writeConfig(String version, String username, String password) {
        Properties pro = new Properties();
        pro.put("app.version", version);
        pro.put("user.name", username);
        pro.put("user.password", password);

        OutputStream out = null;
        try {
            out = new FileOutputStream("config.properties");
            pro.store(out, "config update");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readConfig() {
        Properties pro = new Properties();
        InputStream in = null;
        try {
            in = new FileInputStream("config.properties");
            pro.load(in);       //加载文件

            //从properties中获取数据
            version = pro.getProperty("app.version");
            name = pro.getProperty("user.name");
            password = pro.getProperty("user.password");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        writeConfig("2","fr1014","123456");
        readConfig();
        System.out.println("version: " + version);
        System.out.println("name: " + name);
        System.out.println("password: " + password);
    }
}
