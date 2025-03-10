package com.dmdev.homework10;

import java.util.List;

public class CourseInfo {

    private List<String> students;
    private Double averageGrade;

    public CourseInfo(List<String> students, Double averageGrade) {
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

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
