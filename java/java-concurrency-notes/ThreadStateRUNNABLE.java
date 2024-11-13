public class ThreadStateRUNNABLE {
    public static void main(String[] args) {
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
    }
}
