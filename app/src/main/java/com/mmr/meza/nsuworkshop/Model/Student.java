package com.mmr.meza.nsuworkshop.Model;

/**
 * Created by Majedur Rahman on 10/27/2017.
 */

public class Student {

    private String studentName;
    private String studentDepartment;
    private double studentCGPA;

    public Student(String studentName, String studentDepartment, double studentCGPA) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.studentCGPA = studentCGPA;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }
}
