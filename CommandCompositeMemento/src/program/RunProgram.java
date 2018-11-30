package program;

import commands.*;
import entities.Message;

import java.util.Arrays;
import java.util.List;
import entities.Message.Memento;

public class RunProgram
{
    public static void main(String[] args)
    {
        Message message = new Message("Bill Gates",
                "Windows is going to change the world");

        ICommand composite = new CompositeCommand(
                new WordPerLineCommand(message),
                new AddLetterSpacingCommand(message)
        );

        //save a snapshot of my message
        Memento snapshot = message.getMemento();

        //make some changes
        composite.doCommand();
        System.out.println("After commands execute: " + message.toString());

        //rollback if necessary
        message.setMemento(snapshot);
        System.out.println("After rollback: " + message.toString());
    }

    private static void testCompositeCommands()
    {
        Message message = new Message("Bill Gates",
                "Windows is going to change the world");

        ICommand composite = new CompositeCommand(
                new WordPerLineCommand(message),
                new AddLetterSpacingCommand(message)
        );
        ICommand shout = new ShoutingCommand(message);
        ICommand allCommands = new CompositeCommand(composite, shout);

        //group together our commands in a data structure
        System.out.println("Before: " + message.toString());
        allCommands.doCommand();
        System.out.println("After: " + message.toString());

        //undo all commands
        /*composite.undoCommand();
        System.out.println("After undo: " + message.toString());
        composite.doCommand();
        System.out.println("After redo: " + message.toString());*/
    }

    private static void testCommand()
    {
        Message message = new Message("Bill Gates",
                "Windows is going to change the world");

        ICommand words = new WordPerLineCommand(message);
        ICommand spacing = new AddLetterSpacingCommand(message);

        //group together our commands in a data structure
        List<ICommand> commands = Arrays.asList(words, spacing);
        System.out.println("Before: " + message);
        for (int i = 0; i < commands.size(); i++)
        {
            commands.get(i).doCommand();
        }
        System.out.println("After: " + message);

        //undo all commands
        for (int i = commands.size() - 1; i >= 0; i--)
        {
            commands.get(i).undoCommand();
        }
        System.out.println("After undo all: " + message);

        //undo and redo
        /*words.undoCommand();
        System.out.println("Undo: " + message);
        words.doCommand();
        System.out.println("Redo: " + message);*/
    }
}
