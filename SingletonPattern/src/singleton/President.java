package singleton;

public class President
{
    private String lastName;
    private String firstName;
    private String country;

    //my singleton object
    private static President instance;

    private President(String lastName, String firstName, String country)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.country = country;
    }

    public static President getInstance()
    {
        //if this is the first request
        if (instance == null)
        {
            instance = new President("Angela", "Merkel", "Germany");
        }
        return instance;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getCountry()
    {
        return country;
    }

    @Override
    public String toString()
    {
        return "President{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
