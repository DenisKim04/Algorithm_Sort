public class BubbleSort {
    private int[] array ;

    public BubbleSort() {
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


    private void swap(int firstIndex, int secondIndex) {
        int box = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = box;
    }


    public void Sort() {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int in = 0; in < i; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }
}
