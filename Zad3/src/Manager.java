import java.time.LocalDate;

public class Manager extends Employee {
    int bonus;

    public Manager(String firstName, String lastName, LocalDate birthdayYear, LocalDate hireDate, String companyName, int salary, int bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
        this.bonus = bonus;


    }

    @Override
    public int getSalary() {
        return salary + bonus;
    }

    @Override
    public String toString() {

        System.out.println(getClass().getSimpleName() + "with lastName" + lastName + " and age" + getAge() + " has salary" + salary);
        return null;
    }
}
