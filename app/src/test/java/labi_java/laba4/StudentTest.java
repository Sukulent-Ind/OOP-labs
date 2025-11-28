package labi_java.laba4;

import org.junit.jupiter.api.Test;

import labi_java.laba4.classes.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

class StudentTest {

    @Test
    void testGetDecisionWithNoBadGrades() {
        // Arrange
        Map<String, Integer> grades = Map.of(
            "Программирование", 5,
            "Философия", 4,
            "Сети", 5,
            "Методы оптимизации", 4
        );
        Student student = Student.createStudent(grades);
        
        // Act & Assert
        assertFalse(student.getDecision());
    }

    @Test
    void testGetDecisionWithOneBadGrade() {
        // Arrange
        Map<String, Integer> grades = Map.of(
            "Программирование", 2,
            "Философия", 4,
            "Сети", 5,
            "Методы оптимизации", 3
        );
        Student student = Student.createStudent(grades);
        
        // Act & Assert
        assertFalse(student.getDecision());
    }

    @Test
    void testGetDecisionWithTwoBadGrades() {
        // Arrange
        Map<String, Integer> grades = Map.of(
            "Программирование", 2,
            "Философия", 2,
            "Сети", 4,
            "Методы оптимизации", 3
        );
        Student student = Student.createStudent(grades);
        
        // Act & Assert
        assertTrue(student.getDecision());
    }

    @Test
    void testGetDecisionWithThreeBadGrades() {
        // Arrange
        Map<String, Integer> grades = Map.of(
            "Программирование", 2,
            "Философия", 2,
            "Сети", 2,
            "Методы оптимизации", 4
        );
        Student student = Student.createStudent(grades);
        
        // Act & Assert
        assertTrue(student.getDecision());
    }

    @Test
    void testGetDecisionWithAllBadGrades() {
        // Arrange
        Map<String, Integer> grades = Map.of(
            "Программирование", 2,
            "Философия", 2,
            "Сети", 2,
            "Методы оптимизации", 2
        );
        Student student = Student.createStudent(grades);
        
        // Act & Assert
        assertTrue(student.getDecision());
    }
}
