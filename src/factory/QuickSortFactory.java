package factory;

import createSrot.CreateSort;
import sort.QuickSort;

public class QuickSortFactory implements SortFactory {

    @Override
    public CreateSort createSort(int[] array) {
        return new QuickSort(array);
    }
}
