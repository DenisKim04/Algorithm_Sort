package factory;

import createSrot.CreateSort;
import sort.MergeSort;

public class MergeSortFactory implements SortFactory {

    @Override
    public CreateSort createSort() {
        return new MergeSort();
    }
}
