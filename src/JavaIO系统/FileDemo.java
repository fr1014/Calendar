package JavaIO系统;

import java.io.File;

/**
 * 在指定的目录中查找文件
 */
public class FileDemo {

    public static void main(String[] args) {
        findFile(new File("src"),".java");
    }

    /**
     * 查找文件的方法
     *
     * @param target 目标文件
     * @param ext    扩展名
     */
    private static void findFile(File target, String ext) {
        if (target == null) return;
        //如果文件时目录
        if (target.isDirectory()){
            File[] files = target.listFiles();
            if (files != null){
                for (File f : files){
                    findFile(f,ext);
                }
            }
        }else {
            //表示File是一个文件，非文件夹
            String name = target.getName().toLowerCase();
            if (name.endsWith(ext)){
                System.out.println(target.getAbsolutePath());
            }
        }
    }
}
