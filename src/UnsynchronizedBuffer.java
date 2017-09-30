/**
 * Created by Alex on 30.09.2017.
 */
public class UnsynchronizedBuffer implements Buffer {
    private int buffer = -1;

    public void set(int value) {
        System.err.println(Thread.currentThread().getName() + " is writing " + value);
        buffer = value;
    }

    public int get() {
        System.err.println(Thread.currentThread().getName() + "is reading " + buffer);
        return buffer;
    }
}
