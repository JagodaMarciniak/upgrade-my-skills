package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int[] table = createTable(20);
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(removeMultipliersOfTwo(table)));

    }

    public static int[] createTable(int maximumNumber) {
        int[] table = new int[maximumNumber];
        for (int i = 0; i < maximumNumber; i++) {
            table[i] = i;
        }
        return table;
    }

    public static int[] removeMultipliersOfTwo(int[] table) {
        int[] tableToClean = Arrays.copyOf(table, table.length);
        for (int i = 2; i * i < tableToClean.length; i++) {

            for (int j = 0; j < tableToClean.length; i = i + 2) {
                tableToClean[j] = 0;
            }
        }
        return tableToClean;
    }

//    public static int numberOfPrime(int[] table) {
//        for (int i = 0; i < table.length; i++) {
//        }
}



