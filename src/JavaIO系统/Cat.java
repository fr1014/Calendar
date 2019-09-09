package JavaIO系统;

import java.io.Serializable;

/**
 * 如果一个类创建的对象，需要被序列化，那么该类必须实现Serializable接口
 * Serializable是一个标记接口，没有任何定义，为了告诉JVM该类对象可以被序列化
 *
 * 什么时候对象需要序列化
 * 1、把对象保存到文件中（存储到物理介质）
 * 2、对象需要在网络上传输
 */
public class Cat implements Serializable {

    private transient int id; //在序列化的过程中被忽略
    private String name;
    private int age;
    private String sex;

    public Cat(){

    }

    public Cat(int id,String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
