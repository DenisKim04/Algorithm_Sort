import createSrot.CreateSort;
import factory.*;

import java.util.Locale;
import java.util.Scanner;

public class Viewer {
    public void console(){
        System.out.print("Enter type sort: ");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next().toLowerCase(Locale.ROOT) + " sort";
        printSort(type);
        console();
    }


    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println(" ");

    }


    public void printSort(String typeSort) {
        System.out.println(typeSort);
        int[] items = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
        System.out.println("Array length " + items.length);
        printArray(items);
        SortFactory sortFactory = creteSortByType(typeSort);
        CreateSort createSort = sortFactory.createSort(items);
        createSort.sort();
        printArray(items);

    }

    public  SortFactory creteSortByType(String type) {
        switch (type) {
            case ("bubble sort"):
                return new BubbleSortFactory();
            case ("inner sort"):
                return new InnerSortFactory();
            case ("quick sort"):
                return new QuickSortFactory();
            case ("merge sort"):
                return new MergeSortFactory();
            default:
                throw new RuntimeException(type + " it's sort to been");
        }
    }

}
