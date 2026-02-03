import java.util.Random;

public class Producer implements Runnable {

    Box b;
    Random r;

    public Producer(Box b) {
        this.b = b;
        r = new Random();
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                int n = r.nextInt(100);

                b.spazio.acquire();
                b.mutex.acquire();

                b.q.add(n);
                System.out.println("Producer produce: " + n);

                b.mutex.release();
                b.elementi.release();

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Errore Producer");
            }
        }
    }
}
