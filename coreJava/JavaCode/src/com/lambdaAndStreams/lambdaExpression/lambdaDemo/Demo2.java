package com.lambdaAndStreams.lambdaExpression.lambdaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        new Thread(()->{
            System.out.println("My Runnable method using Lambda");
        }).start();


        Employee john = new Employee("John", 30);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("Jack", 40);
        Employee snow = new Employee("Snow", 22);
        List<Employee> employeeLists = new ArrayList<>();
        employeeLists.add(john);
        employeeLists.add(tim);
        employeeLists.add(jack);
        employeeLists.add(snow);

//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (o1.getName().compareTo(o2.getName()));
//            }
//        });
//
        //Sorting data using lambda

        //Collections.sort(employeeList, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
        Collections.sort(employeeLists, (e1, e2) -> e1.getName().compareTo(e2.getName()));


            UpperConcat uc = (s1,  s2) ->{
                String res = s1.toUpperCase() + s2.toUpperCase();
                return res;
            };
            String sillyString = doStuff(uc, employeeLists.get(0).getName(), employeeLists.get(1).getName());
            System.out.println(sillyString);


        employeeLists.forEach(item-> System.out.println(item.getName() + " --> " + item.getAge()));


        for(Employee employee: employeeLists){
            System.out.println("Employess -> " + employee.getName() + " ");
            new Thread(() -> System.out.println(employee.getAge())).start();
        }

    }

    public final static String doStuff(UpperConcat uc, String s1, String s2){
        String res = s1.toUpperCase() + "," + s2.toUpperCase();
        return res;
    }

    public static class Employee{
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    interface UpperConcat{
        public String upperAndConcat(String s1, String s2);
    }

    class AnotherClass {
        public String doSomething(){
            UpperConcat uc = ((s1, s2) -> {
                System.out.println("Lambada express class is " + getClass().getSimpleName());
                String res = s1.toUpperCase() + " " + s2.toUpperCase();
                return res;
            });
            System.out.println("Another class name is " + getClass().getSimpleName());
            return Demo2.doStuff(uc, "String1" , "String2");
        }
    }
}
