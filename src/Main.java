import createSrot.CreateSort;
import factory.*;

import sort.*;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        viewer.console();
    }

}


//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("[" + array[i] + "] ");
//        }
//        System.out.println(" ");
//
//    }
//}

//        // Merge sort
//        //______________________________________________________________________________________
//        int[] items = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
//        System.out.println("Merge sort");
//        System.out.println("Array length " + items.length);
//        System.out.println("_______________________________________________________________________");
//        MergeSort mergeSort = new MergeSort(items);
//        printArray(mergeSort.getArray());
//        mergeSort.sort(mergeSort.getArray(), mergeSort.getArray().length);
//        printArray(mergeSort.getArray());

//        // Bubble sort
//        //_______________________________________________________________________________________
//        int[] ints = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
//        System.out.println("Bubble sort");
//        System.out.println("Array length " + ints.length);
//        System.out.println("_______________________________________________________________________");
//        BubbleSort bubbleSort = new BubbleSort(ints);
//        printArray(bubbleSort.getArray());
//        bubbleSort.Sort(bubbleSort.getArray());
//        printArray(bubbleSort.getArray());

//        // Insert sort
//        //____________________________________________________________________________________
//        int[] array = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
//        System.out.println("Insert sort");
//        System.out.println("Array length " + array.length);
//        System.out.println("_______________________________________________________________________");
//        InsertSort insertsSort = new InsertSort(array);
//        printArray(insertsSort.getArray());
//        insertsSort.sort(insertsSort.getArray());
//        printArray(insertsSort.getArray());
//        //Quick Sort
//        //____________________________________________________________________________________
//        int[] quickSortArray = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
//        System.out.println("Quick Sort");
//        System.out.println("Array length " + array.length);
//        System.out.println("_______________________________________________________________________");
//        QuickSort quickSort = new QuickSort(quickSortArray);
//        printArray(quickSort.getArray());
//        int low = 0;
//        int high = quickSort.getArray().length - 1;
//        quickSort.sort(quickSort.getArray(), low, high);
//        printArray(quickSort.getArray());
