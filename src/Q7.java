import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q7 {
    //find highest salary employee

    public static void main(String args[]){
        List<Employee1> employees=new ArrayList<>();
        employees.add(new Employee1("Ram" ,120001,"HR") );
        employees.add(new Employee1("Shayam" ,120002,"HR") );
        employees.add(new Employee1("Sita" ,120003,"HR") );

        employees.add(new Employee1("Rohan" ,120004,"IT") );
        employees.add(new Employee1("Rahul" ,120005,"IT") );
        employees.add(new Employee1("Rani" ,120006,"IT") );

        Optional<Employee1> emp=employees.stream().collect(Collectors.maxBy(Comparator.comparing(employee-> employee.getSalary())));

        System.out.println(emp.orElse(null).getName());
    }

}

class Employee1 {
    private String name;
    private int salary;
    private String department;

    public Employee1(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
