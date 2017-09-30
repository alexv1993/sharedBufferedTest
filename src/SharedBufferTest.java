/**
 * Created by Alex on 30.09.2017.
 */
public class SharedBufferTest {
    public static void main(String[] args) {
        Buffer sharedLocation = new UnsynchronizedBuffer();

        Producer producer = new Producer(sharedLocation);
        Consumer consumer = new Consumer(sharedLocation);

        producer.start();
        consumer.start();
    }
}
