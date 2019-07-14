package thread;

import java.util.concurrent.TimeUnit;

public class StopThread {

    public static void main(String[] args) {
        MoonRunner moonRunner = new MoonRunner();
        Thread thread = new Thread(moonRunner, "MoonThread");
        thread.start();
        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        thread.interrupt();
        moonRunner.cancel();
    }

    public static class MoonRunner implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
//            while (!Thread.currentThread().isInterrupted()){
//                i++;
//                System.out.println("i = "+i);
//            }
//            System.out.println("stop");
            while (on) {
                i++;
                System.out.println("i = " + i);
            }
            System.out.println("stop");
        }

        public void cancel() {
            on = false;
        }
    }
}
