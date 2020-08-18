package 设计模式.责任链模式;

public interface IBaseTask {

    /**
     *
     * @param level 等级（达到某等级可以处理该任务）
     * @param iBaseTask 下一个任务节点
     */
    void doAction(int level,IBaseTask iBaseTask);
}
