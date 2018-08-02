package pl.coderstrust.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayToSort = {3, 20, 7, 40, 15, 27, 0};
        System.out.println("Unsorted array : ");
        printArray(arrayToSort);
        System.out.println();
        selectionSort(arrayToSort);
        System.out.println("Sorted array :");
        printArray(arrayToSort);
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMinNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMinNumber]) {
                    indexOfMinNumber = j;
                }
            }
            swap(array, i, indexOfMinNumber);
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
            System.out.printf("  %s", array[i]);
        }
    }
}
