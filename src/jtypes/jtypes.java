package jtypes;

import java.util.Arrays;

/**
 * Created by hosam on 2/17/2019.
 */
public class jtypes {

    public static void main(String[] args) {
        char c = 'H'; // 2 bytes
        String myString = "Hosam"; // 4 bytes

        System.out.println(c);
        System.out.println(Arrays.toString(myString.split("s|S")));

        Strings love = new Strings("Shimaa");

        String nameArr = love.toArray();

        System.out.println(nameArr.replaceAll("(, )(\\[|])", "-$1"));
        System.out.println("Name Value = "+love.value());
    }
}
