package 设计模式.观察者模式;

public class Test {
    public static void main(String[] args) {
        //observable
        Observable observable = new Subscription();
        //observer
        Observer user1 = new WeiXinUser("fr");
        Observer user2 = new WeiXinUser("ghl");
        observable.addObserver(user1);
        observable.addObserver(user2);
        observable.notify("welcom");
    }
}
