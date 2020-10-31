package 设计模式.责任链模式;

public class TaskThree implements IBaseTask {
    @Override
    public void doAction(int level, IBaseTask iBaseTask) {
        if (level <= 3) {
            System.out.println("任务三处理了");
        } else {
            iBaseTask.doAction(level, iBaseTask);
        }
    }
}
