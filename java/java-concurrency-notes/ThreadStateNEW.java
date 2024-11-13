public class ThreadStateNEW {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("# NEW -------");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread thread = new Thread(runnable);
        System.out.println(thread.getState());
    }
}
