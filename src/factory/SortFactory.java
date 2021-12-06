package factory;

import createSrot.CreateSort;

public interface SortFactory {

    CreateSort createSort(int[] array);
}
