package sort;

import createSrot.CreateSort;

public class BubbleSort implements CreateSort, SwapElement {
    private int[] array;

    @Override
    public void sort() {
        bubbleSort();

    }

    private void bubbleSort() {

        for (int i = array.length - 1; i >= 1; i--) {
            for (int in = 0; in < i; in++) {
                if (array[in] > array[in + 1]) {
                    swap(array, in, in + 1);
                }
            }
        }
    }
    @Override
    public void swap(int[] array, int lowIndex, int highIndex) {
        int box = array[lowIndex];
        array[lowIndex] = array[highIndex];
        array[highIndex] = box;
    }

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
