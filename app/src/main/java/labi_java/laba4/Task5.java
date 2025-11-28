package labi_java.laba4;

import labi_java.laba4.classes.*;

public class Task5 {
    public static void main(String[] args) {
        StudentArrayWrapper studentArray = new StudentArrayWrapper(5);
        
        // Заполнение массива студентами
        for (int i = 0; i < 5; i++) {
            studentArray.add(Student.generateStudent());
        }
        
        // Обработка студентов
        for (int i = 0; i < studentArray.size(); i++) {
            Student student = studentArray.get(i);
            System.out.println(student.getStudentInfo());
            System.out.println("Отчислен: " + student.getDecision());
            System.out.println();
        }
    }
}
