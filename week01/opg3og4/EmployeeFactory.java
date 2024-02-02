package Week1.opg3og4;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeFactory {
    public static void main(String[] args) {

        //opg. 3,1
        List<Integer> randNums = Arrays.asList(23, 32, 49, 70);

        Predicate<Integer> div7 = number -> number % 7 == 0;

        List<Integer> filteredNum = randNums.stream()
                .filter(div7)
                .collect(Collectors.toList());

        System.out.println(filteredNum);


        //opg.3,2 , 3,3 , 3,4
        List<String> employeeNames = Arrays.asList("Peter", "Julius", "Tony", "Gary", "Patrick");

        Supplier<Employee> employeeSupplier = () -> {
            Random random = new Random();
            int randomIndex = random.nextInt(employeeNames.size());
            String randomName = employeeNames.get(randomIndex);
            //int randomAge = random.nextInt(66);
            int randomDay = 1 + random.nextInt(28);
            int randomMonth = 1 + random.nextInt(12);
            int randomYear = 1960 + random.nextInt(60);
            LocalDate birthday = LocalDate.of(randomYear, randomMonth, randomDay);
            return new Employee(randomName, birthday);

        };

        List<Employee> employeesList = createEmployees(5, employeeSupplier);
        //Consumer<Employee> printElement = element -> System.out.println(element);
        employeesList.forEach(System.out::println);

        //opg 3,5
        Predicate<Employee> isOlderThan18 = emp -> emp.getAge() > 18;
        employeesList.stream()
                .filter(isOlderThan18)
                .forEach(emp -> System.out.println(emp + " is older than 18"));

        //opg.4.2
        double averageAge = employeesList.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);
        System.out.println("Average Age: " + averageAge);

        //opg.4.3
        Month birthMonth = Month.SEPTEMBER;
        List<Employee> septemberBabies = employeesList.stream()
                .filter(a -> a.birthday.getMonth() == birthMonth)
                .collect(Collectors.toList());
        System.out.println("Employees with birthdays in " + birthMonth + ": " + septemberBabies);

        //opg.4.5
        Month currentMonth = LocalDate.now().getMonth();
        List<Employee> employeesBirthdayMonth = employeesList.stream()
                .filter(a -> a.birthday.getMonth() == currentMonth)
                .collect(Collectors.toList());
        System.out.println("Employees celebrating their birthday this month of " + currentMonth + ": " + employeesBirthdayMonth);

    }


    public static List<Employee> createEmployees(int numEmps, Supplier<Employee> supplier) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < numEmps; i++) {
            employees.add(supplier.get());
        }
        return employees;
    }
}

