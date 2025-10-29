package labi_java.laba2.classes;

public final class BadPupil extends Pupil {
    
    @Override
    public String Study() {
        
        return "Bad Pupil not studying";
    }

    @Override
    public String Read() {
        
        return "Bad Pupil not reading";
    }

    @Override
    public String Write() {
        
        return "Bad Pupil not writing";
    }

    @Override
    public String Relax() {
        
        return "Bad Pupil relaxing";
    }

    @Override
    public int getCurrentGrade() {
        return 3;
    }
}
