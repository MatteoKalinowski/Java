public class Main {

    public static void main(String[] args) {

        Box b = new Box();

        Thread t1 = new Thread(new Producer(b));
        Thread t2 = new Thread(new Consumer(b));

        t1.start();
        t2.start();
    }
}
