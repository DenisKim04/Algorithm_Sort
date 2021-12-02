package factory;

import createSrot.CreateSort;
import sort.BubbleSort;

public class BubbleSortFactory implements SortFactory{

    @Override
    public CreateSort createSort() {
        return new BubbleSort();
    }
}
