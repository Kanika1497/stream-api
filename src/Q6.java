import java.util.*;
import java.util.stream.Collectors;

public class Q6 {
    //Group employees by department
    public static void main(String args[]){

        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Ram" ,120000,"HR") );
        employees.add(new Employee("Shayam" ,120000,"HR") );
        employees.add(new Employee("Sita" ,120000,"HR") );

        employees.add(new Employee("Rohan" ,120000,"IT") );
        employees.add(new Employee("Rahul" ,120000,"IT") );
        employees.add(new Employee("Rani" ,120000,"IT") );

        Map<Object, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        for(Object key : map.keySet()){
            System.out.print(key.toString()+" - ");
            for(Employee emp : map.get(key) ){
                System.out.print(emp.getName() +" , ");
            }
            System.out.println();

        }

        // count in each department

        Map<Object,Long> countmap=employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment() , Collectors.counting()));

        for(Object key : countmap.keySet()){
            System.out.println(key.toString() + " - "+ countmap.get(key));
        }

        //Avg salary per department

        Map<Object , Double> avgSal=employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.averagingDouble(employee -> employee.getSalary())));
        for(Object key : avgSal.keySet()){
            System.out.println(key.toString() + " - "+ avgSal.get(key));
        }

        // get max salary per department
        Map<Object, Optional<Employee>> result= employees.stream().collect(Collectors.groupingBy(employee-> employee.getDepartment(),Collectors.maxBy(Comparator.comparing(employee-> employee.getSalary()))));

        for(Object key : result.keySet()){
            System.out.println(key.toString() + " - "+ result.get(key).orElse(null).getName());
        }
    }
}

class Employee {
    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
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