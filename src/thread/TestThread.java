package thread;

public class TestThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Hello Word");
    }

    public static void main(String[] args) {
        Thread mThread = new TestThread();
        mThread.start();
    }
}
