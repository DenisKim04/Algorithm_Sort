package factory;

import createSrot.CreateSort;
import sort.InsertSort;

public class InnerSortFactory implements SortFactory{
    @Override
    public CreateSort createSort(int[] array) {
        return new InsertSort(array);
    }
}
