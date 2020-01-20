package com.lambdaAndStreams.lambdaExpression.SuppliersEg;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    static Function<String, String> res = (s)-> s.toUpperCase();
    static Function<String, String> resRef = res;

    static Supplier<Employee> employeeSupplier = Employee::new;
    public static void main(String[] args) {

        Supplier<Employee> employees = ()-> {
            return new Employee("Joy", "San Franciso", 123, 981343);
        };
        System.out.println(employees.get());

        System.out.println(res.apply("address"));
        System.out.println(resRef.apply("address"));
        employeeSupplier = employees;
        System.out.println(employeeSupplier.get());
     }
}
