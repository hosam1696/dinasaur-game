package jtypes;

import java.util.Arrays;

/**
 * Created by hosam on 2/18/2019.
 */
public class Strings {
    String data_store;

    Strings(String str) {
        this.data_store = str;
    }

    public String toArray() {
        return Arrays.toString(data_store.split(""));
    }

    public String value() {
        return data_store;
    }

}
