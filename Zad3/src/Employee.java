import java.time.Period;
import java.time.LocalDate;

public class Employee extends Person {
    LocalDate hireDate;
    String companyName;
    int salary;


    public Employee(String firstName, String lastName, LocalDate birthdayYear, LocalDate hireDate, String companyName, int salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;


    }

    public int getJobSeniority() {
        return Period.between(hireDate, currentDate).getYears();
    }

    public int getSalary() {
        return salary;
    }

@Override
    public String toString() {

        System.out.println(getClass().getSimpleName() + "with lastName" + lastName + " and age" + getAge() + " has salary" + salary);
    return null;
}
}
