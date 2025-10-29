package labi_java.laba2;

import org.junit.jupiter.api.Test;

import labi_java.laba2.classes.*;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void testClassRoomCreationWithTwoPupils() {
        ClassRoom room = new ClassRoom(new ExelentPupil(), new GoodPupil());
        assertEquals(4, room.GetPupils().length);
    }

    @Test
    void testClassRoomCreationWithThreePupils() {
        ClassRoom room = new ClassRoom(new ExelentPupil(), new GoodPupil(), new BadPupil());
        assertEquals(4, room.GetPupils().length);
    }

    @Test
    void testClassRoomCreationWithFourPupils() {
        ClassRoom room = new ClassRoom(
            new ExelentPupil(), 
            new GoodPupil(), 
            new BadPupil(), 
            new ExelentPupil()
        );
        assertEquals(4, room.GetPupils().length);
    }

    @Test
    void testAverageGradeCalculation() {
        ClassRoom room = new ClassRoom(new ExelentPupil(), new ExelentPupil());
        assertEquals(4, room.GetPupils().length);
        double average = room.GetRoundGrade();
        assertTrue(average >= 2.0 && average <= 5.0, "Average grade should be between 2.0 and 5.0");
    }

    @Test
    void AverageGradeCalculationExelentPupil() {
        ClassRoom room = new ClassRoom(new ExelentPupil(), new ExelentPupil(), new ExelentPupil(), new ExelentPupil());
        double average = room.GetRoundGrade();
        assertTrue(average == 5.0, "Average grade should be 5.0");
    }

    @Test
    void AverageGradeCalculationGoodPupil() {
        ClassRoom room = new ClassRoom(new GoodPupil(), new GoodPupil(), new GoodPupil(), new GoodPupil());
        double average = room.GetRoundGrade();
        assertTrue(average == 4.0, "Average grade should be 4.0");
    }

    @Test
    void AverageGradeCalculationBadPupil() {
        ClassRoom room = new ClassRoom(new BadPupil(), new BadPupil(), new BadPupil(), new BadPupil());
        double average = room.GetRoundGrade();
        assertTrue(average == 3.0, "Average grade should be 3.0");
    }

    @Test
    void testTooSmallClassRoomSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ClassRoom(new ExelentPupil()); // 1 ученик
        });
    }

    @Test
    void testTooHugeClassRoomSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ClassRoom(
                new ExelentPupil(), new GoodPupil(), 
                new BadPupil(), new ExelentPupil(), new GoodPupil()
            ); // 5 учеников
        });
    }
}