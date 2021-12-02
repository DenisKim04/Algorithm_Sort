package sort;

import createSrot.CreateSort;

public class BubbleSort extends Sort implements CreateSort {


    public BubbleSort() {
    }

    public BubbleSort(int[] array) {
        super(array);
    }

    public BubbleSort(String typeSort) {
        super("bubble");
    }


    @Override
    public void sort() {
        bubbleSort();

    }

    private void bubbleSort() {
        int[] array = getArray();
        for (int i = array.length - 1; i >= 1; i--) {
            for (int in = 0; in < i; in++) {
                if (array[in] > array[in + 1]) {
                    swap(array, in, in + 1);
                }
            }
        }
        setArray(array);
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int box = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = box;
    }

}
