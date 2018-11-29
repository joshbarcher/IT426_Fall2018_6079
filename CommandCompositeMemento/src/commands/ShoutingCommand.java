package commands;

import entities.Message;

public class ShoutingCommand implements ICommand
{
    private Message receiver;

    private String oldMessage;

    public ShoutingCommand(Message receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void doCommand()
    {
        oldMessage = receiver.getMessageBody();
        receiver.setMessageBody(oldMessage.toUpperCase());
    }

    @Override
    public void undoCommand()
    {
        receiver.setMessageBody(oldMessage);
    }
}
