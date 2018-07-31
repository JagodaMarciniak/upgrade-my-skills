package pl.coderstrust.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayToSort = {3, 20, 7, 40, 15, 27};
        System.out.println("Unsorted array : ");
        printArray(arrayToSort);
        System.out.println();
        sortArray(arrayToSort);
        System.out.println("Sorted array :");
        printArray(arrayToSort);
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int counter = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[counter]) {
                    counter = j;
                }
            }

            int smallerNumber = array[counter];
            array[counter] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}