package adventurers;

import behaviors.IBehavior;
import communications.IPersonality;

public abstract class AbstractAdventurer
{
    private String myName;
    private IBehavior behavior;
    private IPersonality personality;

    public AbstractAdventurer(String myName, IBehavior behavior, IPersonality personality)
    {
        this.myName = myName;
        this.behavior = behavior;
        this.personality = personality;
    }

    public void interact()
    {
        //take some actions
        personality.sayHi("Sally");
        behavior.act();
        personality.sayGoodbye();
    }
}
