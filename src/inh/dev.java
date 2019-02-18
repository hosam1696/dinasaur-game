package inh;

/**
 * Created by hosam on 2/18/2019.
 */
public class dev {

    public static void main(String[] args) {

        B b = new B();
        String[] props = b.logProps();
        System.out.println(props);

        C c = new C();

        System.out.println(c.propC);
    }

}
