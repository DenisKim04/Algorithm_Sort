package sort;

import createSrot.CreateSort;

public class MergeSort implements CreateSort {
    private int[] array;
    @Override
    public void sort() {
        mergeSort(array, array.length);

    }

    public void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] firstHalfItems = new int[middle];
        int[] secondHalfItems = new int[length - middle];
        int startIndex = 0;
        firstHalfItems = inputArray(firstHalfItems, array, startIndex);
        secondHalfItems = inputArray(secondHalfItems, array, firstHalfItems.length);
        mergeSort(firstHalfItems, firstHalfItems.length);
        mergeSort(secondHalfItems, secondHalfItems.length);
        merge(array, firstHalfItems, secondHalfItems, middle, length - middle);

    }

    private int[] inputArray(int[] InputArray, int[] outputArray, int indexOutputArray) {
        for (int i = 0; i < InputArray.length; i++) {
            InputArray[i] = outputArray[indexOutputArray];
            indexOutputArray++;
        }
        return InputArray;
    }


    private void merge(int[] itemsZero, int[] itemsOne, int[] itemsTwo, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (itemsOne[i] <= itemsTwo[j]) {
                itemsZero[k++] = itemsOne[i++];
            } else {
                itemsZero[k++] = itemsTwo[j++];
            }
        }
        while (i < left) {
            itemsZero[k++] = itemsOne[i++];
        }
        while (j < right) {
            itemsZero[k++] = itemsTwo[j++];
        }

    }

    public MergeSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
