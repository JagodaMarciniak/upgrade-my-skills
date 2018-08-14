package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        int size = input.nextInt();
        System.out.println(getPascalTriangle(size));
    }

    public static List<String> getPascalTriangle(int size) {
        if (size <= 0) {
            return new ArrayList<String>(Collections.singletonList("Invalid value"));
        }
        List<String> result = new ArrayList<String>();
        StringBuilder storage = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                storage.append(number);
                number = number * (i - j) / (j + 1);
            }
            result.add(storage.toString());
            storage.delete(0, storage.length());
        }
        return result;
    }
}
