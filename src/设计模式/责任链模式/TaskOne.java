package 设计模式.责任链模式;

public class TaskOne implements IBaseTask {
    @Override
    public void doAction(int level, IBaseTask iBaseTask) {
        if (level <= 1) {
            System.out.println("任务一处理了");
        } else {
            iBaseTask.doAction(level, iBaseTask);
        }
    }
}
