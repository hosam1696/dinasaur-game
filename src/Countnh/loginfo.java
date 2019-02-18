package Countnh;

/**
 * Created by hosam on 2/18/2019.
 */
public class loginfo {

    public static void print(String args) {
        System.out.println(args);
    }

    public static void print(int args) {
        System.out.println(args);
    }

    public static void main(String[] args) {
        CountInh ci = new CountInh();
        A a = new A();
        B b = new B();


        print("Numbers of time the class Initiated = "+ CountInh.getCounter());
    }
}
