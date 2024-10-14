package kuzmich;

public class Counter implements AutoCloseable {
    public static int counter = 0;

    public void add() {
        counter++;
    }

    public int getCount() {
        return counter;
    }

    @Override
    public void close() throws Exception {

    }
}
