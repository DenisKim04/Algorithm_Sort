package sort;

import createSrot.CreateSort;

public class SelectionSort extends Sort implements CreateSort {

    @Override
    public void sort() {
        selectionSort();
    }

    private void selectionSort() {
        int[] array = getArray();
        for (int i = 0; i < array.length; i++) {
            int minValue = i;
            for (int in = 0; in < array.length; in++) {
                if (array[in] < array[minValue])
                    minValue = in;

            }
            swap(array,i,minValue);
        }
    }

    public void swap(int[] array, int lowIndex, int highIndex) {
    int outValue = array[lowIndex];
    array[lowIndex] = array[highIndex];
    array[highIndex] = outValue;
    }
}