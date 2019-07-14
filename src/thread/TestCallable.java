package thread;

import java.util.concurrent.*;

public class TestCallable {

    public static class MyTestCallable implements Callable{

        @Override
        public Object call() throws Exception {
            return "Hello world";
        }
    }

    public static void main(String[] args) {
        MyTestCallable mMyTestCallable = new MyTestCallable();
        ExecutorService mExecutorService = Executors.newSingleThreadExecutor();
        Future mFuture = mExecutorService.submit(mMyTestCallable);
        try {
            //等待线程结束，并返回结果
            System.out.println(mFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
