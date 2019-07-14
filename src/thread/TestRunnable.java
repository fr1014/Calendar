package thread;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        Thread thread = new Thread(testRunnable);
        thread.interrupt();
        while (thread.isInterrupted()){
//            thread.start();
            System.out.println("test");
        }
    }
}
