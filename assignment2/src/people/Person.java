package people;

public class Person
{
    protected String name;
    protected String emailAddress;

    public Person(String name, String emailAddress)
    {
        this.name         = name;
        this.emailAddress = emailAddress;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String toString()
    {
        return "Person: " + getName();
    }
}
