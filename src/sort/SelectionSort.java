package sort;

import createSrot.CreateSort;

public class SelectionSort implements CreateSort , SwapElement {
private int[] array;


    @Override
    public void sort() {
        selectionSort();
    }

    private void selectionSort() {

        for (int i = 0; i < array.length; i++) {
            int minValue = i;
            for (int in = 0; in < array.length; in++) {
                if (array[in] < array[minValue])
                    minValue = in;

            }
            swap(array,i,minValue);
        }
    }
    @Override
    public void swap(int[] array, int lowIndex, int highIndex) {
        array[lowIndex] = array[lowIndex] + array[highIndex] - (array[highIndex] - array[lowIndex]);
//    int outValue = array[lowIndex];
//    array[lowIndex] = array[highIndex];
//    array[highIndex] = outValue;
    }

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}