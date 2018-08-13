package pl.coderstrust.pascal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        int size = input.nextInt();
        getPascalTriangle(size);
    }

    public static List<String> getPascalTriangle(int size) {
        List<String> result = new ArrayList<String>();
        StringBuilder storage = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int number = 1;
            storage.append(number);
            for (int k = 0; k < (size - i) * 2; k++) {
                System.out.print(" ");
                storage.append(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
                storage.append(number);
            }
            System.out.println();
            result.add(storage.toString());
            storage.delete(0, storage.length());
        }
        return result;
    }
}