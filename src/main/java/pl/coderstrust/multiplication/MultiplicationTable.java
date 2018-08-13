package pl.coderstrust.multiplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(getMultiplicationTable(5));
    }

    public static List<String> getMultiplicationTable(int size) {
        ArrayList<String> result = new ArrayList<String>();
        StringBuilder storage = new StringBuilder();
        if (size <= 0) {
            return new ArrayList<String>(Collections.singleton("Invalid value"));
        }
        int[][] multiplicationTable = new int[size][size];
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int col = 0; col < multiplicationTable[row].length; col++) {
                
                multiplicationTable[row][col] = (row + 1) * (col + 1);
                int number = multiplicationTable[row][col];
                storage.append(" " + number);
            }
        }
        result.add(storage.toString());
        storage.delete(0, storage.length());
        return result;
    }
}
