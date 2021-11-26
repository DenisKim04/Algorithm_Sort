class InsertSort {
    private int[] array;

    public void sort() {

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

    public InsertSort() {
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
