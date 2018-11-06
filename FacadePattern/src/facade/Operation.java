package facade;

import modules.StringOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Operation
{
    private String[] data;

    public Operation(String[] data)
    {
        this.data = data;
    }

    public String[] getData()
    {
        return data;
    }

    public Operation removeDuplicates()
    {
        this.data = StringOperations.removeDuplicates(data);
        return this;
    }

    public Operation resize(int newLength)
    {
        this.data = StringOperations.resize(data, newLength);
        return this;
    }

    public Operation filter(String search)
    {
        this.data = StringOperations.filter(data, search);
        return this;
    }
}
