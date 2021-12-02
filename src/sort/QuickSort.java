package sort;

import createSrot.CreateSort;

public class QuickSort extends Sort implements CreateSort {

    public QuickSort() {
    }

    public QuickSort(int[] array) {
        super(array);
    }

    public QuickSort(String typeSort) {
        super("Quick");
    }


    private void quickSort(int[] array, int low, int high) {

        if (array.length == 0)
            return;

        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int wall = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < wall) {
                i++;
            }
            while (array[j] > wall) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
        return;
    }

    private void swap(int[] array, int i, int j) {
        int outElement = array[i];
        array[i] = array[j];
        array[j] = outElement;
    }

    @Override
    public void sort() {
        int[] array = getArray();
        int low = 0;
        int high = getArray().length - 1;
        quickSort(array, low, high);
        setArray(array);
    }
}
