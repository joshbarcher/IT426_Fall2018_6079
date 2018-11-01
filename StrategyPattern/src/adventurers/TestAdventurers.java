package adventurers;

import communications.AustralianPersonality;
import communications.CharismaticPersonality;

public class TestAdventurers
{
    public static void main(String[] args)
    {
        /*AbstractAdventurer knight = new AbstractAdventurer("Cold Steel",
                new NomadicBehavior(), new EdgyPersonality());
        knight.interact();

        AbstractAdventurer anotherKnight = new AbstractAdventurer("Thunderclap",
                new BraveBehavior(), new AustralianPersonality());
        anotherKnight.interact();*/

        AbstractAdventurer oswald = new Knight("Oswald", new CharismaticPersonality());
        oswald.interact();

        AbstractAdventurer molly = new Princess("Molly", new AustralianPersonality());
        molly.interact();
    }
}
