package com.dmdev.homework10;

import java.util.List;

public class CourseInfo {

    private List<Student> students;
    private Double averageGrade;

    public CourseInfo(List<Student> students, Double averageGrade) {
        this.students = students;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "CourseInfo{" +
                "students=" + students +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
