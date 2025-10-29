package labi_java.laba2;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import labi_java.laba2.classes.*;

public class PupilTet {
    @Test
    void testPupilMethodsExecution() {
        ExelentPupil pupil = new ExelentPupil();
        assertDoesNotThrow(() -> {
            pupil.Study();
            pupil.Read();
            pupil.Write();
            pupil.Relax();
            pupil.getCurrentGrade();
        });
    }

    @Test
    void testPupilMethods() {
        Pupil pupil = new Pupil();
        assertTrue(pupil.Study() == "Pupil studying");
        assertTrue(pupil.Read() == "Pupil reading");
        assertTrue(pupil.Write() == "Pupil writing");
        assertTrue(pupil.Relax() == "Pupil relaxing");

    }

    @Test
    void testExelentPupilMethods() {
        Pupil pupil = new ExelentPupil();
        assertTrue(pupil.Study() == "Exelent Pupil studying");
        assertTrue(pupil.Read() == "Exelent Pupil reading");
        assertTrue(pupil.Write() == "Exelent Pupil writing");
        assertTrue(pupil.Relax() == "Exelent Pupil relaxing");
    }

    @Test
    void testGoodPupilMethods() {
        Pupil pupil = new GoodPupil();
        assertTrue(pupil.Study() == "Good Pupil studying");
        assertTrue(pupil.Read() == "Good Pupil reading");
        assertTrue(pupil.Write() == "Good Pupil writing");
        assertTrue(pupil.Relax() == "Good Pupil relaxing");
    }

    @Test
    void testBadPupilMethods() {
        Pupil pupil = new BadPupil();
        assertTrue(pupil.Study() == "Bad Pupil not studying");
        assertTrue(pupil.Read() == "Bad Pupil not reading");
        assertTrue(pupil.Write() == "Bad Pupil not writing");
        assertTrue(pupil.Relax() == "Bad Pupil relaxing");
    }

    @Test
    void testExelentPupilGradeRange() {
        Pupil pupil = new ExelentPupil();
        for (int i = 0; i < 100; i++) {
            int grade = pupil.getCurrentGrade();
            assertTrue(grade == 5, "ExelentPupil should only get 5");
        }
    }

    @Test
    void testGoodPupilGradeRange() {
        Pupil pupil = new GoodPupil();
        for (int i = 0; i < 100; i++) {
            int grade = pupil.getCurrentGrade();
            assertTrue(grade == 4, "GoodPupil should get 4");
        }
    }

    @Test
    void testBadPupilGradeRange() {
        Pupil pupil = new BadPupil();
        for (int i = 0; i < 100; i++) {
            int grade = pupil.getCurrentGrade();
            assertTrue(grade == 3, "BadPupil should get grade ");
        }
    }
}
