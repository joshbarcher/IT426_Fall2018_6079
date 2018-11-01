package communications;

public class CharismaticPersonality implements IPersonality
{
    @Override
    public void sayHi(String name)
    {
        System.out.println("Hello, " + name + ", a good day is it not!");
    }

    @Override
    public void sayGoodbye()
    {
        System.out.println("Fair well!");
    }
}
