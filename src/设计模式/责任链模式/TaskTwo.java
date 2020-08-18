package 设计模式.责任链模式;

public class TaskTwo implements IBaseTask {
    @Override
    public void doAction(int level, IBaseTask iBaseTask) {
        if (level <= 2) {
            System.out.println("任务二处理了");
        } else {
            iBaseTask.doAction(level, iBaseTask);
        }
    }
}
