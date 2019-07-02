package people;

public class Faculty extends Employee
{
    private String officeHours;

    public Faculty(String officeHours, double salary, String name, String emailAddress)
    {
        super(salary, name, emailAddress);

        this.officeHours = officeHours;
    }

    public String getOfficeHours()
    {
        return officeHours;
    }

    public void setOfficeHours(String officeHours)
    {
        this.officeHours = officeHours;
    }

    @Override
    String toString()
    {
        return "Faculty: " + getName();
    }
}
