package pl.coderstrust.multiplication;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] myTable = createMultiplicationTable(10);
        System.out.print(Arrays.deepToString(myTable));
        System.out.println();
        for (int row = 0; row < myTable.length; row++) {
            for (int column = 0; column < myTable[row].length; column++) {
                System.out.printf("%2d ", myTable[row][column]);
            }
            System.out.println();
        }
    }

    public static int[][] createMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];
        System.out.println();
        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int col = 0; col < multiplicationTable[row].length; col++) {
                multiplicationTable[row][col] = (row + 1) * (col + 1);
            }
        }
        return multiplicationTable;
    }
}