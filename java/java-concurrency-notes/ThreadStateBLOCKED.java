public class ThreadStateBLOCKED {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("# BLOCKED ---------");
        Thread t2 = new Thread(new DemoBlockedRunnable());
        Thread t3 = new Thread(new DemoBlockedRunnable());
        t2.start();
        t3.start();
        Thread.sleep(1000);
        System.out.println("First thread >> " + t2.getState());
        System.out.println("Second thread >> " + t3.getState());
        /**
         * First thread >> RUNNABLE
         * Second thread >> BLOCKED
         */
        t2.interrupt();
        t3.interrupt();
    }
}
