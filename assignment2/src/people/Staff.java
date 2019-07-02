package people;

public class Staff extends Employee
{
    private String title;

    public Staff(String title, double salary, String name, String emailAddress)
    {
        super(salary, name, emailAddress);

        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    String toString()
    {
        return "Staff: " + getName();
    }
}
