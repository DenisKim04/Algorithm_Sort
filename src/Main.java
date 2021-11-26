public class Main {
    public static void main(String[] args) {

        // Merge sort
        //______________________________________________________________________________________
        int[] items = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
        System.out.println("Array length "+ items.length);
        MergeSort mergeSort = new MergeSort(items);
        System.out.println("Merge fort");
        System.out.println("_______________________________________________________________________");
        printArray(mergeSort.getItems());
        mergeSort.sort(mergeSort.getItems(), mergeSort.getItems().length);
        printArray(mergeSort.getItems());
        // Bubble sort
        //_______________________________________________________________________________________
        int[] ints = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
        System.out.println("Array length "+ ints.length);
        BubbleSort bubbleSort = new BubbleSort(ints);
        System.out.println("Bubble sort");
        System.out.println("_______________________________________________________________________");
        printArray(bubbleSort.getArray());
        bubbleSort.Sort();
        printArray(bubbleSort.getArray());

        // Insert sort
        //____________________________________________________________________________________
        int[] array = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
        System.out.println("Array length "+ array.length);
        InsertSort insertsSort = new InsertSort(array);
        System.out.println("Insert sort");
        System.out.println("_______________________________________________________________________");
        printArray(insertsSort.getArray());
        insertsSort.sort();
        printArray(insertsSort.getArray());


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println(" ");

    }
}
