package labi_java.laba2.classes;

import java.util.Arrays;

public class ClassRoom {
    private static int pupilsCount = 4;
    private Pupil pupils[];
    
    public ClassRoom(Pupil... new_pupils){
        if (new_pupils.length < 2 || new_pupils.length > pupilsCount) {
            throw new IllegalArgumentException("ClassRoom must have 2 to 4 pupils");
        }
        
        this.pupils = Arrays.copyOf(new_pupils, 4);
        
        for (int i = new_pupils.length; i < 4; i++) {
            this.pupils[i] = GenerateRandomPupil();
        }
    }

    private Pupil GenerateRandomPupil() {
        int random = new java.util.Random().nextInt(3);
        return switch (random) {
            case 0 -> new ExelentPupil();
            case 1 -> new GoodPupil();
            case 2 -> new BadPupil();
            default -> new GoodPupil();
        };
    }

    public double GetRoundGrade() {
        int grades_sum = 0;

        for (Pupil pupil: this.pupils) {
            grades_sum += pupil.getCurrentGrade();
        }

        double roundGrade = grades_sum / pupilsCount;
        return roundGrade;
    }

    public Pupil[] GetPupils() {
        return this.pupils;
    }

    static public int GetPupilsCount() {
        return pupilsCount;
    }
}