package model;

import observer.Observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class FruitData extends Observable
{
    private List<Fruit> fruits;

    public FruitData()
    {
        fruits = new ArrayList<>();
    }

    //CRUD ACCESS
    public void addFruit(Fruit fruit)
    {
        fruits.add(fruit);

        //let others know something change
        notifyObservers(Change.ADD);
    }

    public void removeFruit(UUID id)
    {
        boolean foundSomething = false;
        for (int i = fruits.size() - 1; i >= 0; i--)
        {
            if (id.equals(fruits.get(i).getId()))
            {
                fruits.remove(i);
                foundSomething = true;
            }
        }

        //only notify observers once
        if (foundSomething)
        {
            notifyObservers(Change.REMOVE);
        }
    }

    public List getFruits()
    {
        return Collections.unmodifiableList(fruits);
    }

    public void updateFruit(UUID id, String type, boolean fresh)
    {
        for (int i = 0; i < fruits.size(); i++)
        {
            Fruit check = fruits.get(i);
            if (id.equals(check.getId()))
            {
                check.setType(type);
                check.setFresh(fresh);
                notifyObservers(Change.UPDATE); //update observers
                break;
            }
        }
    }

    public enum Change
    {
        ADD,
        REMOVE,
        UPDATE,
        RETRIEVE
    }
}