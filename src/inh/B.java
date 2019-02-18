package inh;

/**
 * Created by hosam on 2/18/2019.
 */
public class B extends A{

    B() {
        System.out.println("B Class Constructor");
        super.printRandom();
    }

    protected void  echo(String word) {
        System.out.println(word);
    }
}
