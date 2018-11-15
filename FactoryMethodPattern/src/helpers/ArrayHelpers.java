package helpers;

public class ArrayHelpers
{
    public static boolean isSorted(int[] searchSpace)
    {
        for (int i = 0; i < searchSpace.length - 1; i++)
        {
            if (searchSpace[i] > searchSpace[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
