package factory;

import createSrot.CreateSort;
import sort.SelectionSort;

public class SelectionSortFactory implements  SortFactory{
    @Override
    public CreateSort createSort(int[] array) {
        return new SelectionSort(array);
    }
}
