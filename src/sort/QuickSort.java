package sort;

import createSrot.CreateSort;

public class QuickSort implements CreateSort , SwapElement {

   private int[] array;


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
    @Override
    public void swap(int[] array, int lowIndex, int highInndex) {
        int outElement = array[lowIndex];
        array[lowIndex] = array[highInndex];
        array[highInndex] = outElement;
    }

    @Override
    public void sort() {
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
    }

    public QuickSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
