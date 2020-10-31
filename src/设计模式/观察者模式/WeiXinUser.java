package 设计模式.观察者模式;

public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("update: "+ message);
    }
}
