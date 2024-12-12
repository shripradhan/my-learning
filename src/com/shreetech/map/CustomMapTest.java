package com.shreetech.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    Double salary;
    public Employee(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}

public class CustomMapTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Shrikant", "IT", 750.0);
        Employee emp2 = new Employee("Amol", "HR", 200.0);
        Employee emp3 = new Employee("Shivam", "ADMIN", 300.0);
        Employee emp4 = new Employee("Rajesh", "IT", 400.0);
        Employee emp5 = new Employee("Gaurav", "HR", 500.0);
        Employee emp6 = new Employee("Milind", "IT", 600.0);
        Employee emp7 = new Employee("Mayur", "ADMIN", 700.0);


        Map<String, Employee> empMap = Map.of("Shrikant", emp1, "Amol", emp2, "Shivam", emp3, "Rajesh", emp4, "Gaurav", emp5, "Milind", emp6, "Mayur", emp7);
        List<Employee> employees = getEmployees(empMap);
        System.out.println(employees.size());

    }

    static List<Employee> getEmployees(Map<String, Employee> empMap) {

        empMap.entrySet().stream().filter(emp -> emp.getValue().getSalary() > 500).map(Map.Entry::getKey).forEach(System.out::println);

        return empMap.values().stream().filter(employee -> employee.getSalary() > 500).collect(Collectors.toList());
    }


}
