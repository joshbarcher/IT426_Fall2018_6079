package program;

import commands.AddLetterSpacingCommand;
import commands.ICommand;
import commands.WordPerLineCommand;
import entities.Message;

import java.util.Arrays;
import java.util.List;

public class RunProgram
{
    public static void main(String[] args)
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
