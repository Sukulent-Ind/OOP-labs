package labi_java.laba2.classes;

public final class GoodPupil extends Pupil {
    
    @Override
    public String Study() {
        
        return"Good Pupil studying";
    }

    @Override
    public String Read() {
        
        return "Good Pupil reading";
    }

    @Override
    public String Write() {
        
        return "Good Pupil writing";
    }

    @Override
    public String Relax() {
        
        return "Good Pupil relaxing";
    }

    @Override
    public int getCurrentGrade() {
        return 4;
    }
}
