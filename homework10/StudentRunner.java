package com.dmdev.homework10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRunner {
    public static void main(String[] args) {

        List<Double> grades1 = Arrays.asList(4.0, 4.0, 5.0, 3.0, 5.0);
        List<Double> grades2 = Arrays.asList(4.0, 4.0, 5.0);
        List<Double> grades3 = Arrays.asList(4.0, 4.0, 5.0, 4.0, 5.0);
        List<Double> grades4 = Arrays.asList(3.0, 4.0, 5.0, 3.0, 5.0);
        List<Double> grades5 = Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0);

        List<Student> students = Arrays.asList(
                new Student("Илья", "Ильин", 3, grades1),
                new Student("Даша", "Дарьева", 4, grades2),
                new Student("Игнат", "Игнатьев", 2, grades3),
                new Student("Света", "Светикова", 4, grades4),
                new Student("Александр", "Александров", 5, grades5),
                new Student("Света", "Петрова", 4, grades4)
                );

        Map<Integer, Double> averageGradeMap = students.stream()
                .filter(s -> s.getGrades().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourse,
                                Collectors.averagingDouble(s -> s.getGrades().stream()
                                        .mapToDouble(Double::doubleValue)
                                        .average()
                                        .orElse(0.0))));
        System.out.println("Средняя оценка по курсу: " + averageGradeMap);

        Map<Integer, List<String>> stringMap = students.stream()
                .sorted(new StudentFirstNameComparator().thenComparing(new StudentLastNameComparator()))
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.mapping(Student::getFullName,
                                Collectors.toList())));
        System.out.println(stringMap);

        Map<Integer, CourseInfo> infoMap = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.collectingAndThen(Collectors.toList(), studentList -> {
                                List<String> sortedStudents = studentList.stream()
                                        .sorted(new StudentFirstNameComparator()
                                                .thenComparing(new StudentLastNameComparator()))
                                    .collect(Collectors.mapping(Student::getFullName,
                                                Collectors.toList()));

                        double averageGrade = studentList.stream()
                                .flatMap(s -> s.getGrades().stream())
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0.0);
                        return new CourseInfo(sortedStudents, averageGrade);
                        })));
        System.out.println(infoMap);
    }
}
