package com.lambdaAndStreams.streamEg;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployeeDemo {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);


        Department hr = new Department("Human Resources");
        hr.addEmployee(jack);
        hr.addEmployee(jane);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);


        departments.stream().flatMap(department -> department.getEmployees().stream()).forEach(item -> System.out.println(item.getAge() + " " + item.getName()));
        System.out.println("===========================================");
        departments.stream().flatMap(department -> department.getEmployees().stream()).
                reduce((e1, e2)-> e1.getAge() < e2.getAge()?e1:e2)
                .ifPresent(item -> System.out.println(item.getAge() + " " + item.getName()));

        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employe->employe.getAge()));
        System.out.println("===========================================");
        groupedByAge.entrySet().stream().forEach(item->item.getValue().stream().forEach(res-> System.out.println(res.getName() +" " +res.getAge())));
    }
}
