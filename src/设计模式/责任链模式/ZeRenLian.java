package 设计模式.责任链模式;

public class ZeRenLian {

    public static void main(String[] args) {
        ChainManager cm = new ChainManager();
        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();
        TaskThree taskThree = new TaskThree();
        cm.addTask(taskOne);
        cm.addTask(taskTwo);
        cm.addTask(taskThree);

        cm.doAction(2, cm);
    }
}
