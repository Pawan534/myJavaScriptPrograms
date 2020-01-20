package com.lambdaAndStreams.lambdaExpression.demo2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Alberto", 30);
        Employee tim = new Employee("Tim Mac", 21);
        Employee jack = new Employee("Jack Johson", 40);
        Employee snow = new Employee("Snow Ronaldo", 22);
        Employee lary = new Employee("Lary Edwardo", 33);
        List<Employee> employeeLists = new ArrayList<>();
        employeeLists.add(john);
        employeeLists.add(tim);
        employeeLists.add(jack);
        employeeLists.add(snow);
        employeeLists.add(lary);

//        employeeLists.forEach(employee -> {
//            if(employee.getAge()>=30){
//                new Thread(()-> {
//                    try{
//                        Thread.sleep(100);
//                    }catch (InterruptedException e){
//
//                    }
//                    System.out.println(employee.getName() + " " + employee.getAge());
//                }).start();
//            }else if(employee.getAge() <30){
//                System.out.println(employee.getName() + " " + employee.getAge());
//            }
//        });


        //Another way

        printEmployeesByAge(employeeLists, "Employee over 30", employee -> employee.getAge()>30);

        printEmployeesByAge(employeeLists, "Employee less than 31", employee -> employee.getAge()<31);

        IntPredicate intf = i -> i>15;
        System.out.println(intf.test(100));


        System.out.println("Last name of the employes");
        employeeLists.forEach(employee ->{
            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
            String lastNames = employee.getName().split(" ")[1];
            System.out.println(lastName);
            System.out.println(lastNames);
        });

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf( ' ') + 1);
        };

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        System.out.println("Last of 2nd candidate " +getLastName.apply(employeeLists.get(2)));
        System.out.println("First of 2nd candidate " +getFirstName.apply(employeeLists.get(2)));



    }


    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("*************************");
        employees.forEach(employee->{
            if(ageCondition.test(employee)){
                System.out.println(employee.getName() + " " + employee.getAge());
            }
        });
    }
}
