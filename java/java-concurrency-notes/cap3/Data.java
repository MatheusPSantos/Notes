package cap3;

public class Data {
  private String packet;
  private boolean transfer = true; // True if receiver should wait
  // False if sender should wait

  public synchronized String receive() {
    while (transfer) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }
    }
    transfer = true;
    String returnPacket = packet;
    notifyAll();
    return returnPacket;
  }

  public synchronized void send(String packet) {
    while (!transfer) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }

    }
    transfer = false;
    this.packet = packet;
    notifyAll();
  }
}
