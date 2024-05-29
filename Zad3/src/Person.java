import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Date;

public abstract class Person {
    String firstName;
    String lastName;
    int birthdayYear;


    public Person(String firstName, String lastName, int birthdayYear){}

    int currentDate = Year.now().getValue();
    public int getAge() {
        return currentDate-birthdayYear;
    }
}


