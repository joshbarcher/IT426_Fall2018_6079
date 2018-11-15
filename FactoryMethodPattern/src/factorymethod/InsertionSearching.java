package factorymethod;

import searchingsorting.ISearchingSorting;
import searchingsorting.InsertAndInterpolateSearch;

public class InsertionSearching extends Searching
{
    public InsertionSearching(int[] arrayToSearch)
    {
        super(arrayToSearch);
    }

    @Override
    public ISearchingSorting getSearchingObject()
    {
        return new InsertAndInterpolateSearch();
    }
}
