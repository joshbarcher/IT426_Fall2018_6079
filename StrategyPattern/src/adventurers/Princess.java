package adventurers;

import behaviors.NomadicBehavior;
import communications.IPersonality;

public class Princess extends AbstractAdventurer
{
    public Princess(String myName, IPersonality personality)
    {
        super(myName, new NomadicBehavior(), personality);
    }
}
