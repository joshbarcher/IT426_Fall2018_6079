package communications;

public class EdgyPersonality implements IPersonality
{
    @Override
    public void sayHi(String name)
    {
        System.out.println("Kinda rainy today, " + name + ", ehh?");
    }

    @Override
    public void sayGoodbye()
    {
        System.out.println("Good luck surviving the rest of today!");
    }
}
