package sort;

import createSrot.CreateSort;

public class InsertSort  implements CreateSort {
    private int[] array;
    @Override
    public void sort() {
        insertSort();

    }

    public void insertSort() {

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
    }

    public InsertSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
