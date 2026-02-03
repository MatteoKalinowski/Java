public class Consumer implements Runnable {

    Box b;

    public Consumer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                b.elementi.acquire();
                b.mutex.acquire();

                int n = b.q.remove();
                System.out.println("Consumer consuma: " + n);

                b.mutex.release();
                b.spazio.release();

                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Errore Consumer");
            }
        }
    }
}
