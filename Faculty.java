import java.util.Calendar;

public class Faculty extends Employee implements Cloneable {
    private Level level;
    private Education education;

    public Faculty() {
    }

    public Faculty(String lastName, String firstName, String idNumber, String sex, Calendar date, Level level, Education education) {
        super(lastName, firstName, idNumber, sex, date);
        this.level = level;
        this.education = education;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public double monthlyEarning() {
        double salary = 0;
        if (this.level == Level.AS) {
            salary = EmployeeInfo.FACULTY_MONTHLY_SALARY;
        } else if (this.level == Level.AO) {
            salary = EmployeeInfo.FACULTY_MONTHLY_SALARY * 1.2;
        } else if (this.level == Level.FU) {
            salary = EmployeeInfo.FACULTY_MONTHLY_SALARY * 1.4;
        }
        return salary;
    }

    @Override
    public String toString() {
        String result = "ID Employee number :" + this.getIdNumber() + "\n"
                + "Employee name:" + this.getFirstName() + " " + this.getLastName() + "\n"
                + "Birth date:" + (this.getDate().get(Calendar.MONTH) + 1) + "/" + this.getDate().get(Calendar.DAY_OF_MONTH) + "/" + this.getDate().get(Calendar.YEAR) + "\n";
        if (this.level == Level.AS) {
            result += "Assistant Professor" + "\n"
                    + "Monthly Salary:" + monthlyEarning();
        } else if (this.level == Level.AO) {
            result += "Associate Professor" + "\n"
                    + "Monthly Salary:" + monthlyEarning();
        } else if (this.level == Level.FU) {
            result += "Full Professor" + "\n"
                    + "Monthly Salary:" + monthlyEarning();
        }
        return result;
    }


    @Override
    public Faculty clone() {
        try {
            Faculty clone = (Faculty) super.clone();
            clone.setEducation(this.getEducation().clone());
            clone.setDate((Calendar) this.getDate().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

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
