package adventurers;

import behaviors.CuriousBehavior;
import communications.IPersonality;

public class Squire extends AbstractAdventurer
{
    public Squire(String myName, IPersonality personality)
    {
        super(myName, new CuriousBehavior(), personality);
    }
}
