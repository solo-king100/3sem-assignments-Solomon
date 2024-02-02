package Week1.opg3og4;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    LocalDate birthday;
    //private int age;


    public Employee(String name, LocalDate birthday ){
        this.name=name;
        this.birthday=birthday;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return Period.between(this.birthday,LocalDate.now())
                .getYears();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + getAge();
    }



}
