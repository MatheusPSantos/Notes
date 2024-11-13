

class JavaConcurrencyNotesApplication {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("# NEW -------");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread thread = new Thread(runnable);
        System.out.println(thread.getState());

        System.out.println("# Runnable --------");
        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnn");
            }
        };
        Thread t1 = new Thread(run2);
        t1.start();
        System.out.println(t1.getState());

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
        System.exit(0);
    }
}