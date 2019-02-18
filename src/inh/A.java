package inh;

import java.util.Random;

/**
 * Created by hosam on 2/18/2019.
 */
public class A {
    public String propA = "Public Property of A Class";
    private String propB = "Private Property of A Class";
    protected String propC = "Protected Property of C Class";

    A() {

    }

    public String[] logProps() {
        String[] result = {propA};
        return result;
    }

    public void printRandom() {
        System.out.println("Random Number "+ new Random().nextDouble());
    }
}
