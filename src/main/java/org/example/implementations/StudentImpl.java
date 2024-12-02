package org.example.implementations;

import org.example.StudentInterface;

public class StudentImpl implements StudentInterface {
    private String name;
    private double gpa;
    private String specialization;

    public StudentImpl(String name, double gpa, String specialization) {
        this.name = name;
        this.gpa = gpa;
        this.specialization = specialization;
    }

    @Override
    public void study() {
        System.out.println(name + "Обучается на " + specialization + ".");
    }

    @Override
    public double getGPA() {
        return gpa;
    }

    @Override
    public String getDetails() {
        return "Имя: " + name + ", Средний балл: " + gpa + ", Специальность: " + specialization;
    }
}
