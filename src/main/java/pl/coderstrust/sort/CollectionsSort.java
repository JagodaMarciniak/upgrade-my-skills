package pl.coderstrust.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort implements SortingMethod {

    public int[] sort(int array[]) {
        List<Integer> listOfInteger = convertArrayToList(array);
        Collections.sort(listOfInteger);
        return convertListToArray(listOfInteger);
    }

    private List<Integer> convertArrayToList(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }

    private int[] convertListToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
