import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Person {
    String firstName;
    String lastName;
    LocalDate birthdayYear;


    public Person(String firstName, String lastName, LocalDate birthdayYear){}

LocalDate currentDate;
    public int getAge() {
        return Period.between(birthdayYear,currentDate).getYears();
    }
}


