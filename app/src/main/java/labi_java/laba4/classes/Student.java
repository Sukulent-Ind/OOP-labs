package labi_java.laba4.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import labi_java.laba4.interfaces.IStudent;

public class Student implements IStudent {
    private static String[] names = new String[] {
            "Павел", "Азат", "Никита", "Илона", "Георгий", "Дмитрий", "Софья", 
            "Вячеслав", "Василий", "Никита", "Дмитрий", "Арсений", "Никита", 
            "Антон", "Егор", "Егор", "Андрей", "Михаил", "Анастасия", "Илья", 
            "Роман", "Денис", "Виктор", "Владислав", "Данил"
        };

    private static String[] surames = new String[] {
        "АГЛУШЕВИЧ", "БАЙКИН", "БЕЛОГУР", "БУКАТКА", "ВАЛЯВКО", "ВАСЮК", 
        "ГРИШКЕВИЧ", "ЗАЙЦЕВ", "ЗГУРСКИЙ", "КИБКАЛО", "КОЗАРЬ", "КОНЫЧЕВ", 
        "ЛИХОБАБИН", "МАСАЛЬСКИЙ", "ОЖЕРЕЛЬЕВ", "ПАНЬКОВ", "ПЕТРОВСКИЙ", 
        "ПОНАМАРЕВ", "ПОЯСНЮК", "ПРИТУЖАЛОВ", "ПЧЁЛКИН", "СКОВОРОДИН", 
        "СУЛИМОВ", "ШАТИЛО", "ШЕБАЛОВ"
    };

    private static String[] fathernames = new String[] {
        "Вячеславович", "Алмазович", "Александрович", "Борисовна", "Павлович", 
        "Михайлович", "Сергеевна", "Александрович", "Денисович", "Александрович", 
        "Олегович", "Сергеевич", "Валерьевич", "Витальевич", "Владиславович", 
        "Витальевич", "Михайлович", "Сергеевич", "Дмитриевна", "Андреевич", 
        "Валерьевич", "Леонидович", "Алексеевич", "Игоревич", "Валерьевич"
    };

    private Map<String, Integer> grades = new HashMap<>() {{
        put("Программирование", 0);
        put("Философия", 0);
        put("Методы_оптимизации", 0);
        put("Сети", 0);
    }};

    private static Random random = new Random();

    private String name;
    private String surname;
    private String fathername;

    public static Student generateStudent() {
        Student student = new Student();

        student.name = names[random.nextInt(names.length)];
        student.surname = surames[random.nextInt(surames.length)];
        student.fathername = fathernames[random.nextInt(fathernames.length)];

        for (var subject: student.grades.entrySet()) subject.setValue(2 + random.nextInt(4));

        return student;
    };

    public static Student createStudent(Map<String, Integer> testGrades) {
        Student student = new Student();
        student.grades = new HashMap<>(testGrades);
        return student;
    }

    @Override
    public String getStudentInfo() {
        return String.format("Студент %s %s %s имеет следующие оценки: \n" +
        "Программирование: %d \n Философия: %d \n Методы оптимизации: %d \n Сети: %d \n",
        this.name, this.surname, this.fathername,
        this.grades.get("Программирование"),
        this.grades.get("Философия"),
        this.grades.get("Методы_оптимизации"),
        this.grades.get("Сети")
        );
    }

    @Override
    public boolean getDecision() {
        int badGradesCount = 0;
        for (int grade : grades.values()) {
            if (grade == 2) badGradesCount++;
        }
        return badGradesCount >= 2;
    }

}
