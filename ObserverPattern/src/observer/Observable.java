package observer;

import java.util.HashSet;
import java.util.Set;

/**
 * The observable class will track observers
 * and allow child classes to send updates to
 * the observers.
 */
public abstract class Observable
{
    //store observers
    private Set<IObserver> observers;

    public Observable()
    {
        observers = new HashSet<>();
    }

    public void addObserver(IObserver observer)
    {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers(Object... arguments)
    {
        for (IObserver observer : observers)
        {
            observer.update(this, arguments);
        }
    }
}
