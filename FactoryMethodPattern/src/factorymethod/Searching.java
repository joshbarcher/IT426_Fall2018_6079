package factorymethod;

import searchingsorting.ISearchingSorting;

public abstract class Searching
{
    private int[] arrayToSearch;

    public Searching(int[] arrayToSearch)
    {
        this.arrayToSearch = arrayToSearch;
    }

    public boolean inArray(int search)
    {
        ISearchingSorting searching = getSearchingObject();

        //is the array sorted?
        if (!searching.isSorted(arrayToSearch))
        {
            searching.sort(arrayToSearch);
        }

        return searching.searchFor(arrayToSearch, search);
    }

    //our child class will provide what we need to solve this problem
    public abstract ISearchingSorting getSearchingObject();
}
