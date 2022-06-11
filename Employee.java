import java.util.Calendar;

public abstract class Employee implements Comparable<Employee>  {
    private String lastName;
    private String firstName;
    private String idNumber;
    private String sex;
    private Calendar date;

    public Employee() {
    }

    public Employee(String lastName, String firstName, String idNumber, String sex, Calendar date) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.sex = sex;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ID Employee number :" + this.idNumber + "\n"
                + "Employee name:" + this.firstName + " " + this.lastName + "\n"
                + "Birth date:" + (this.getDate().get(Calendar.MONTH) + 1) + "/" + this.getDate().get(Calendar.DAY_OF_MONTH) + "/" + this.getDate().get(Calendar.YEAR);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public abstract double monthlyEarning();
}
