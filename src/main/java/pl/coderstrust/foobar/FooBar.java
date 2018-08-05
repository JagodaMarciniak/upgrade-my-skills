package pl.coderstrust.foobar;

import java.util.ArrayList;
import java.util.List;

public class FooBar {
    public static void main(String[] args) {
        fooOrBar(10);
    }

    private static List<String> fooOrBar(int maximumValue) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i <= maximumValue; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                result.add("Foo");
                System.out.print("Foo");
            }
            if (i % 5 == 0) {
                result.add("Bar");
                System.out.print("Bar");
            }
            System.out.println();
        }
        return result;
    }
}