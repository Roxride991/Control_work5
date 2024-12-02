package org.example.tests;

import org.example.implementations.StudentImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentImplTest {

    private StudentImpl student;

    @BeforeEach
    public void setUp() {
        student = new StudentImpl("ИВАН ", 3.9, "МКН");
    }

    @Test
    public void testStudy() {
        student.study();
    }

    @Test
    public void testGetGPA() {
        double gpa = student.getGPA();
        assertEquals(3.9, gpa, 0.01);
    }

    @Test
    public void testGetDetails() {
        String details = student.getDetails();
        assertNotNull(details);
        assertEquals("Имя: ИВАН , Средний балл: 3.9, Специальность: МКН", details);
    }
}
