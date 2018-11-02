package model;

import observer.IObserver;
import observer.Observable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import model.FruitData.Change;

public class Persistence implements IObserver
{
    @Override
    public void update(Observable observable, Object... arguments)
    {
        FruitData model = (FruitData)observable;
        Change change = (Change)arguments[0];

        if (change != Change.RETRIEVE)
        {
            //if there is a change in the model (add, removing, editing fruits)
            //we'll push changes to a file
            try (PrintWriter writer = new PrintWriter(
                    new FileOutputStream("files/fruit.dat")))
            {
                for (Fruit fruit : model.getFruits())
                {
                    writer.println(fruit.toString());
                }
            }
            catch (FileNotFoundException ex)
            {
                System.out.println("Error writing to file: " + ex.getMessage());
            }
        }
    }
}
