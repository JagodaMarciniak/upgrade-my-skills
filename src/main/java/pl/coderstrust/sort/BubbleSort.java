package pl.coderstrust.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayToSort = {3, 4, 2, 1, 10, 55, 0};
        System.out.println("Unsorted array:");
        printArray(arrayToSort);
        bubbleSort(arrayToSort);
        System.out.println();
        System.out.println("Sorted array:");
        printArray(arrayToSort);
    }

    public static int[] bubbleSort(int[] array) {
        for (boolean sorted = false; !sorted; ) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                int indexOfMinNumber = 0;
                if (array[i - 1] > array[i]) {
                    swap(array, i, i - 1);
                    sorted = false;
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int smallerNumber = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = smallerNumber;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("  %d", array[i]);
        }
    }
}
