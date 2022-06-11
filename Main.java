import java.util.*;

public class Main {
    static Employee[] employees = {new Staff("Allen", "Paita", "123", "M", new GregorianCalendar(59, Calendar.FEBRUARY, 23), 50.00),
            new Staff("Zapata", "Steven", "456", "F", new GregorianCalendar(64, Calendar.JULY, 12), 35.00),
            new Staff("Rios", "Enrique", "789", "M", new GregorianCalendar(70, Calendar.JUNE, 2), 40.00),
            new Faculty("Johnson", "Anne", "243", "F", new GregorianCalendar(62, Calendar.APRIL, 27), Level.FU, new Education("Ph.D", "Engineering", 3)),
            new Faculty("Bouris", "William", "791", "F", new GregorianCalendar(75, Calendar.MARCH, 14), Level.AO, new Education("Ph.D", "English", 1)),
            new Faculty("Andrade", "Christopher", "623", "F", new GregorianCalendar(80, Calendar.MAY, 22), Level.AS, new Education("MS", "Physical Education", 0)),
            new Partime("Guzman", "Augusto", "455", "F", new GregorianCalendar(77, Calendar.AUGUST, 10), 35.00, 30),
            new Partime("Depirro", "Martin", "678", "F", new GregorianCalendar(87, Calendar.SEPTEMBER, 15), 30.00, 15),
            new Partime("Aldaco", "Marque", "945", "M", new GregorianCalendar(88, Calendar.NOVEMBER, 24), 20.00, 35)};
    public static boolean byNumber;

    public static void main(String[] args) {
        System.out.print("input choice: ");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        switch (option) {
            case "a":
                printAllEmployeeInformation();
                break;
            case "b":
                System.out.println(totalMonthlySalaryPartTime());
                break;
            case "c":
                System.out.println(totalMonthlySalaryAllEmployees());
                break;
            case "d":
                printEmployeeByIdNumberDescending();
                break;
            case "e":
                printEmployeeByLastNameAscending();
            case "f":
                duplicateFacultyUsingClone();

        }
    }

    private static void duplicateFacultyUsingClone() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Faculty) {
                Faculty faculty = (Faculty) employees[i];
                Faculty facultyClone = (Faculty) faculty.clone();
                System.out.println(facultyClone);
                System.out.println();
            }
        }
    }

    private static void printEmployeeByIdNumberDescending() {
        Main.byNumber = true;
        Arrays.sort(employees);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println();
        }
    }


    private static void printEmployeeByLastNameAscending() {
        Main.byNumber = false;
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println();
        }
    }


    private static void printAllEmployeeInformation() {
        for (Employee employee : employees) {
            System.out.println(employee.toString() + "\n");
        }
    }

    private static double totalMonthlySalaryPartTime() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee instanceof Partime) {
                total += employee.monthlyEarning();
            }
        }
        return total;
    }

    private static double totalMonthlySalaryAllEmployees() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.monthlyEarning();
        }
        return total;
    }
}
