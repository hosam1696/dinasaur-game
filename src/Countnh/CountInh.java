package Countnh;

/**
 * Created by hosam on 2/18/2019.
 */
public class CountInh {
    private static int counter = 0;

    CountInh() {
        this.incrementCounter();
    }

    public static int getCounter() {
        return counter;
    }

    private int incrementCounter() {
        return  counter++;
    }
}
