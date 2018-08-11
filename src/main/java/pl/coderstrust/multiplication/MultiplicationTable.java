package pl.coderstrust.multiplication;

import java.util.ArrayList;
import java.util.Collections;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(5);
    }

    public static ArrayList printMultiplicationTable(int size) {
        ArrayList<String> result = new ArrayList<String>();
        if (size <= 0) {
            return new ArrayList<String>(Collections.singleton("Invalid value"));
        }
        int[][] multiplicationTable = new int[size][size];
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int col = 0; col < multiplicationTable[row].length; col++) {
                multiplicationTable[row][col] = (row + 1) * (col + 1);
            }
        }

        return result;
    }
}
