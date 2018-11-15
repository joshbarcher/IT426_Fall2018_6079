package searchingsorting;

public interface ISearchingSorting
{
    boolean isSorted(int[] searchSpace);
    void sort(int[] searchSpace);
    boolean searchFor(int[] searchSpace, int element);
}
