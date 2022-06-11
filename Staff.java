import java.util.Calendar;

public class Staff extends Employee {
    private double hourlyRate;

    public Staff() {
    }

    public Staff(String lastName, String firstName, String idNumber, String sex, Calendar date, double hourlyRate) {
        super(lastName, firstName, idNumber, sex, date);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlyEarning() {
        return this.hourlyRate * EmployeeInfo.STAFF_MONTHLY_HOURS_WORKED;
    }

    @Override
    public String toString() {
        return "ID Employee number :" + this.getIdNumber() + "\n"
                + "Employee name:" + this.getFirstName() + " " + this.getLastName() + "\n"
                + "Birth date:" + (this.getDate().get(Calendar.MONTH) + 1) + "/" + this.getDate().get(Calendar.DAY_OF_MONTH) + "/" + this.getDate().get(Calendar.YEAR) + "\n"
                + "Full Time" + "\n"
                + "Monthly Salary:" + monthlyEarning();
    }


    @Override
    public int compareTo(Employee o) {
        if (Main.byNumber) {
            return o.getIdNumber().compareTo(this.getIdNumber());
        } else {
            return this.getLastName().compareTo(o.getLastName());
        }
    }
}
