package factory;

import createSrot.CreateSort;
import sort.SelectionSort;

public class SelectionSortFactory implements  SortFactory{
    @Override
    public CreateSort createSort() {
        return new SelectionSort();
    }
}
