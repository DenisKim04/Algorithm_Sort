package sort;

public abstract class Sort {
    private int[] array;
    private String typeSort;

    public Sort() {
    }

    public Sort(int[] array) {
        this.array = array;
    }

    public Sort(String typeSort) {
        this.typeSort = typeSort;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public String getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(String typeSort) {
        this.typeSort = typeSort;
    }
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
    }

}