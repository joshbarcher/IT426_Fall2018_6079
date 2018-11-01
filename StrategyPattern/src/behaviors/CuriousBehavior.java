package behaviors;

public class CuriousBehavior implements IBehavior
{
    @Override
    public void act()
    {
        System.out.println("I spy something interesting over there...");
    }
}
