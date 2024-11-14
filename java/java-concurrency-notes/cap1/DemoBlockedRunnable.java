package cap1;
public class DemoBlockedRunnable implements Runnable {
    @Override
    public void run() {
        commonResource();
    }

    private static synchronized void commonResource() {
        while (true) {
            // Simulating heavy process
        }
    }
}
