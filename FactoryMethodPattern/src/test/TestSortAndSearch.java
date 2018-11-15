package test;

import factorymethod.InsertionSearching;
import factorymethod.MergeSearching;
import factorymethod.Searching;

public class TestSortAndSearch
{
    public static void main(String[] args)
    {
        int[] array = {1, 27, -10, 20, 8, 9, 3, -1, 8};
        Searching searching = new InsertionSearching(array); //new MergeSearching(array);

        System.out.println(searching.inArray(8));
        System.out.println(searching.inArray(-1));
        System.out.println(searching.inArray(42));
    }
}
