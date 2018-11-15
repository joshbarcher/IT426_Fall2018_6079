package factorymethod;

import searchingsorting.ISearchingSorting;
import searchingsorting.MergeAndBinarySearch;

public class MergeSearching extends Searching
{
    public MergeSearching(int[] arrayToSearch)
    {
        super(arrayToSearch);
    }

    @Override
    public ISearchingSorting getSearchingObject()
    {
        return new MergeAndBinarySearch();
    }
}
