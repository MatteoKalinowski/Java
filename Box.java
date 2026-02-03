import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Box {

    int DIM = 5;

    Queue<Integer> q;
    Semaphore spazio;
    Semaphore elementi;
    Semaphore mutex;

    public Box() {
        q = new LinkedList<Integer>();
        spazio = new Semaphore(DIM);
        elementi = new Semaphore(0);
        mutex = new Semaphore(1);
    }
}
