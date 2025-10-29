package labi_java.laba2.classes;

import java.util.Random;

public class Pupil {
    protected Random random = new Random();

    public String Study() {
        return "Pupil studying";
    }

    public String Read() {
        
        return "Pupil reading";
    }

    public String Write() {
        
        return "Pupil writing";
    }

    public String Relax() {
        
        return "Pupil relaxing";
    }

    public int getCurrentGrade() {
        return random.nextInt(4) + 2;
    }
}
