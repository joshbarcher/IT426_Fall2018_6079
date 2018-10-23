package singleton;

public class TestPresidents
{
    public static void main(String[] args)
    {
        //this doesn't work anymore
        //President presidentGermany = new President("Angela", "Merkel", "Germany");

        //retrieve our singleton
        President president1 = President.getInstance();
        System.out.println(president1.toString());

        //prove that only one object is available from getInstance()
        President president2 = President.getInstance();
        System.out.println(president2.toString());
        System.out.println(president1 == president2); //same memory address?
    }
}
