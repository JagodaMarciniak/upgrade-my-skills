package pl.coderstrust.multiplication;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] table = getMultiplicationTable(5);
        System.out.println(Arrays.deepToString(table));
    }

    public static int[][] getMultiplicationTable(int size) {
        if (size <= 0) {
            return new int[0][0];
        }
        int[][] multiplicationTable = new int[size][size];
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int col = 0; col < multiplicationTable[row].length; col++) {
                multiplicationTable[row][col] = (row + 1) * (col + 1);
            }
        }
        return multiplicationTable;
    }
}
