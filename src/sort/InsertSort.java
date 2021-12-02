package sort;

import createSrot.CreateSort;

public class InsertSort extends Sort implements CreateSort {

    @Override
    public void sort() {
        insertSort();

    }

    public void insertSort() {
        int[] array = getArray();
        for (int left = 0; left < array.length; left++) {
            int valueFromArray = array[left];
            int right = left - 1;
            for (; right >= 0; right--) {
                if (valueFromArray < array[right]) {
                    array[right + 1] = array[right];
                } else {
                    break;
                }
            }
            array[right + 1] = valueFromArray;
        }
        setArray(array);
    }


    public InsertSort() {
    }

    public InsertSort(int[] array) {
        super(array);
    }

    public InsertSort(String typeSort) {
        super("Inner");
    }
}
