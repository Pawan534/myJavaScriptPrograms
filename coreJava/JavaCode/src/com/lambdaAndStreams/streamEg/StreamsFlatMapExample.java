package com.lambdaAndStreams.streamEg;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream).distinct().sorted((a1,a2)-> a1.compareTo(a2)) //Stream<String>
                .collect(toList());
        return studentActivities;
    }

    public static List<Student> getAllSortedStudents(){

        List<Student> getSorted = StudentDataBase.getAllStudents().stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName())).filter(s -> s.getGender().equals("male")).collect(toList());
        return getSorted;
    }




    public static void main(String[] args) {

        System.out.println("printStudentActivities : " + printStudentActivities());
        System.out.println("Sorted " + getAllSortedStudents());
    }
}
