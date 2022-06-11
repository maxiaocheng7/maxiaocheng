import java.util.Calendar;

public class Partime extends Staff {
    private int HoursWorkedPerWeek;

    public Partime() {

    }

    public Partime(String lastName, String firstName, String idNumber, String sex, Calendar date, double hourlyRate, int hoursWorkedPerWeek) {
        super(lastName, firstName, idNumber, sex, date, hourlyRate);
        HoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public double getHoursWorkedPerWeek() {
        return HoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
        HoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public double monthlyEarning() {
        return HoursWorkedPerWeek * this.getHourlyRate() * 4;
    }

    @Override
    public String toString() {
        return "ID Employee number :" + this.getIdNumber() + "\n"
                + "Employee name:" + this.getFirstName() + " " + this.getLastName() + "\n"
                + "Birth date:" + (this.getDate().get(Calendar.MONTH) + 1) + "/" + this.getDate().get(Calendar.DAY_OF_MONTH) + "/" + this.getDate().get(Calendar.YEAR) + "\n"
                + "Hours works per month:" + getHoursWorkedPerWeek() + "\n"
                + "Monthly Salary:" + monthlyEarning();
    }
}
