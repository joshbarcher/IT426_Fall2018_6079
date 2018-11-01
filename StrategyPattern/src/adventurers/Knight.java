package adventurers;

import behaviors.BraveBehavior;
import communications.IPersonality;

public class Knight extends AbstractAdventurer
{
    public Knight(String myName, IPersonality personality)
    {
        super(myName, new BraveBehavior(), personality);
    }
}
