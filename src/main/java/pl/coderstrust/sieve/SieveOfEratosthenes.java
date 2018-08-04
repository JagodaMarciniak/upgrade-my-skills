package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private static int marker = 0;

    public static void main(String[] args) {
        int[] table = sieve(20);
        System.out.println(Arrays.toString(table));
    }

    private static int[] sieve(int maximumNumber) {
        int[] table = createTable(maximumNumber);
        for (int i = 2; i < maximumNumber; i++) {
            removeMultipliers(table, i);
        }
        return collectPrimes(table);
    }

    private static int[] createTable(int maximumNumber) {
        int[] table = new int[maximumNumber];
        for (int i = 0; i < maximumNumber; i++) {
            table[i] = i;
        }
        return table;
    }

    private static int[] collectPrimes(int[] table) {
        int counter = 0;
        for (int i = 2; i < table.length; i++) {
            if (table[i] != marker) {
                counter++;
            }
        }
        int[] primes = new int[counter];
        for (int i = 2, j = 0; i < table.length; i++) {
            if (table[i] != marker) {
                primes[j++] = i;
            }
        }
        return primes;
    }

    private static void removeMultipliers(int[] table, int number) {
        for (int i = number + number; i < table.length; i = i + number) {
            table[i] = marker;
        }
    }
}
