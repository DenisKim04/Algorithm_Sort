public class MergeSort {
    private int[] items;


    public void sort(int[] items, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] firstHalfItems = new int[middle];
        int[] secondHalfItems = new int[length - middle];
        int startIndex = 0;
        firstHalfItems = inputArray(firstHalfItems, items, startIndex);
        secondHalfItems = inputArray(secondHalfItems, items, firstHalfItems.length);
        //smacked code throw loop method input
//        for (int i = 0; i < firstHalfItems.length; i++) {
//        firstHalfItems[i] = items[i];
//        }
//       int index = firstHalfItems.length;
//       for (int i = 0; i < secondHalfItems.length; i++) {
//       secondHalfItems[i] = items[index];
//        index ++;
//        }
        sort(firstHalfItems, firstHalfItems.length);
        sort(secondHalfItems, secondHalfItems.length);
        merge(items, firstHalfItems, secondHalfItems, middle, length - middle);

    }

    private int[] inputArray(int[] toInputArray, int[] forInputArray, int indexArray) {

        for (int i = 0; i < toInputArray.length; i++) {
            toInputArray[i] = forInputArray[indexArray];
            indexArray++;
        }
        return toInputArray;
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

    public MergeSort() {
    }

    public MergeSort(int[] items) {
        this.items = items;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }
}
