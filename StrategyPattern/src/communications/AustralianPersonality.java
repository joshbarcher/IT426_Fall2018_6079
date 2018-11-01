package communications;

public class AustralianPersonality implements IPersonality
{
    @Override
    public void sayHi(String name)
    {
        System.out.println("G'day, " + name + "!");
    }

    @Override
    public void sayGoodbye()
    {
        System.out.println("Hooroo!");
    }
}
