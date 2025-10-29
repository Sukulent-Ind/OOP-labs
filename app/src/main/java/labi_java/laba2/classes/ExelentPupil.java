package labi_java.laba2.classes;

public final class ExelentPupil extends Pupil {
    
    @Override
    public String Study() {
        
        return "Exelent Pupil studying";
    }

    @Override
    public String Read() {
        
        return "Exelent Pupil reading";
    }

    @Override
    public String Write() {
        
        return"Exelent Pupil writing";
    }

    @Override
    public String Relax() {
        
        return "Exelent Pupil relaxing";
    }

    @Override
    public int getCurrentGrade() {
        return 5;
    }
}
