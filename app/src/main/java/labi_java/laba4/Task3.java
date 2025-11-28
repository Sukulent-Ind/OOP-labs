package labi_java.laba4;

import java.util.LinkedList;
import java.util.Queue;

import labi_java.laba4.classes.Student;

public class Task3 {
    public static void main(String[] args) {
        Queue<Student> queue = new LinkedList<>();
        
        // Генерация 5 случайных студентов
        for (int i = 0; i < 5; i++) {
            queue.add(Student.generateStudent());
        }
        
        // Обработка очереди
        while (!queue.isEmpty()) {
            Student student = queue.poll();
            System.out.println(student.getStudentInfo());
            System.out.println("Отчислен: " + student.getDecision());
            System.out.println();
        }
    }
}