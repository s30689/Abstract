import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Manager extends Employee {
    double bonus;

    int year = Year.now().getValue();
    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthdayYear=birthdayYear;
        this.hireYear = hireYear;
        this.companyName = companyName;
        this.salary = salary;
        this.bonus=bonus;
    }

@Override
    public double getSalary() {
        return salary + bonus;
    }
@Override
    public int getAge() {
        return currentDate-birthdayYear;
    }

    public String toString() {
        return getClass().getSimpleName() + " with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();

    }
}
