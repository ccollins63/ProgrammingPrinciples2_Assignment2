package people;

public class Student extends Person
{
    private String classStatus;

    public Student(String classStatus, String name, String emailAddress)
    {
        super(name, emailAddress);
        this.classStatus = classStatus;
    }

    public String getClassStatus()
    {
        return classStatus;
    }

    public void setClassStatus(String classStatus)
    {
        this.classStatus = classStatus;
    }

    @Override
    String toString()
    {
        return "Student: " + getName();
    }
}
