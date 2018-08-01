package pl.coderstrust.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayToSort = {3, 4, 2, 1, 10};
        System.out.println("Unsorted array:");
        printArray(arrayToSort);
        bubbleSort(arrayToSort);
        System.out.println();
        System.out.println("Sorted array:");
        printArray(arrayToSort);
    }

    public static int[] bubbleSort(int[] array) {
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 1; i < array.length; i++) {
                int counter = 0;
                if (array[i - 1] > array[i]) {
                    counter = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = counter;
                    change = true;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}