package pl.coderstrust.sieve;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
//        printArray(createTable(20));
        printArray(removeMultipliersOfTwo(createTable(20)));

    }

    public static int[] createTable(int maximumNumber) {
        int[] table = new int[maximumNumber - 1];
        for (int i = 0; i < maximumNumber - 1; i++) {
            table[i] = i + 2;
        }
        return table;
    }

    public static int[] removeMultipliersOfTwo(int[] table) {
        int right = 0;
        int previous = 0;
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i] % 2 == 0) {

            }


        }
        return table;
    }

    public static void printArray(int[] table) {
        for (int i : table) {
            System.out.printf(" %d", i);
        }
    }
}