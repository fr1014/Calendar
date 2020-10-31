package 设计模式.责任链模式;

import java.util.ArrayList;
import java.util.List;

public class ChainManager implements IBaseTask {
    private List<IBaseTask> taskList = new ArrayList<>();

    public void addTask(IBaseTask iBaseTask){
        taskList.add(iBaseTask);
    }

    int index = 0;
    @Override
    public void doAction(int level, IBaseTask iBaseTask) {
        if (iBaseTask == null){
            return;
        }

        if (index < taskList.size()){
            IBaseTask task = taskList.get(index);
            index++;
            task.doAction(level,iBaseTask);
        }
    }
}
