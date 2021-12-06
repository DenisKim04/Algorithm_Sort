import createSrot.CreateSort;
import factory.*;

import java.util.Locale;
import java.util.Scanner;

public class Viewer {


    public void console() {
        System.out.println("Algorithm: Bubble, Quick, Merge, Inner, Selection.");
        System.out.print("Enter type Algorithm sort: ");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next().toLowerCase(Locale.ROOT);
        System.out.println("Type Create: Default, random, self");
        System.out.print("Select type Crete array: ");
        String choice = scanner.next().toLowerCase(Locale.ROOT);
        printSort(type, choice);
        System.out.print("Want to run more?: ");
        String conditions = scanner.next().toLowerCase(Locale.ROOT);
        if (conditions.equals("yes") || conditions.equals("Yes")) {
            console();
        } else {
            System.out.println("Exit the program");
            System.gc();
            System.exit(0);
        }
    }


    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println(" ");
    }

    public void printSort(String typeSort, String choice) {
        System.out.println("You have choosed algorithm:" + typeSort);
        int[] items = selectionCreateArray(choice);
        System.out.println("Array length " + items.length);
        printArray(items);
        SortFactory sortFactory = creteSortByType(typeSort);
        CreateSort createSort = sortFactory.createSort(items);
        createSort.sort();
        printArray(items);
    }

    private int[] selectionCreateArray(String choice) {
        Scanner scanner = new Scanner(System.in);
        int lengthArray;
        if (choice.equalsIgnoreCase("Default")) {
            int[] array = new int[]{10, 299, 53, 129, 489, -122, 0, -1, -328, 999, 666, 65, 11, 11, 1, 10};
            return array;
        } else if (choice.equalsIgnoreCase("Random")) {
            System.out.print("Enter length array : ");
            lengthArray = scanner.nextInt();
            if (lengthArray <= 2) {
                System.out.println("You entered the array length too small, please try again");
                selectionCreateArray(choice);
            }
            return createRandomArray(lengthArray);
        } else if (choice.equalsIgnoreCase("Self")) {
            System.out.println("Enter length array");
            lengthArray = scanner.nextInt();
            if (lengthArray <= 2) {
                System.out.println("You entered the array length too small, please try again");
                selectionCreateArray(choice);
            }
            return creteSelfArray(lengthArray);
        } else {
            throw new RuntimeException(choice + "Error");
        }
    }

    private int[] createRandomArray(int lengthArray) {
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            int value = (int) Math.random();
            array[i] = value;
        }
        return array;
    }

    private int[] creteSelfArray(int lengthArray) {
        int[] array = new int[lengthArray];
        for (int i : array) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("add element by index " + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public SortFactory creteSortByType(String type) {
        switch (type) {
            case ("bubble"):
            case ("bubble sort"):
                return new BubbleSortFactory();
            case ("inner"):
            case ("inner sort"):
                return new InnerSortFactory();
            case ("quick"):
            case ("quick sort"):
                return new QuickSortFactory();
            case ("merge"):
            case ("merge sort"):
                return new MergeSortFactory();
            case ("selection"):
            case ("selection sort"):
                return new SelectionSortFactory();
            default:
                throw new RuntimeException(type + " it's sort to been");
        }
    }

}
