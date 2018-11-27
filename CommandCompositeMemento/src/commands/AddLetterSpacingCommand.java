package commands;

import entities.Message;

public class AddLetterSpacingCommand implements ICommand
{
    private Message receiver;

    //save the messageBody so we can come back to it later if necessary
    private String oldMessageBody;

    public AddLetterSpacingCommand(Message receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void doCommand()
    {
        oldMessageBody = receiver.getMessageBody();
        receiver.setMessageBody(String.join(" ", oldMessageBody.split("")));
    }

    @Override
    public void undoCommand()
    {
        receiver.setMessageBody(oldMessageBody);
    }
}
