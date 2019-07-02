package people;

import java.util.Date;

public class Employee extends Person
{
    protected double salary;
    private Date dateHired;

    public Employee(double Salary, String name, String emailAddress)
    {
        super(name, emailAddress);

        this.salary = salary;
        dateHired   = new Date();
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Date getDateHired()
    {
        return dateHired;
    }

    @Override
    String toString()
    {
        return "Employee: " + getName();
    }
}
