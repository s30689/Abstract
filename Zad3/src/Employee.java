import java.time.Period;
import java.time.LocalDate;

public class Employee extends Person {
    int hireYear;
    String companyName;
    double salary;


    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireYear = hireYear;
        this.companyName = companyName;
        this.salary = salary;


    }

    public int getJobSeniority() {
        return hireYear-currentDate;
    }

    public double getSalary() {
        return salary;
    }

@Override
    public String toString() {

        return getClass().getSimpleName() + "with lastName" + lastName + " and age" + getAge() + " has salary" + salary;

}
}
