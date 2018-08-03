package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int[] table = createTable(20);
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(removeMultipliersOfTwo(table)));

    }

    public static int[] createTable(int maximumNumber) {
        int[] table = new int[maximumNumber - 1];
        for (int i = 0; i < maximumNumber - 1; i++) {
            table[i] = i + 2;
        }
        return table;
    }

    public static int[] removeMultipliersOfTwo(int[] table) {
        int[] tableToClean = Arrays.copyOf(table, table.length);
        int[] tableCleaned = {};


        for (int j = 0; j < tableToClean.length; j++)

            while (tableToClean[j] % 2 != 0) {
                tableCleaned[j] = tableToClean[j];


            }


        return tableCleaned;
    }

    private static void shift(int[] array, int indexA, int indexB) {
        int removed = array[indexA];
        array[indexA] = array[indexB];
    }

    public static void printArray(int[] table) {
        for (int i : table) {
            System.out.printf(" %d", i);
        }
    }
}