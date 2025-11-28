package labi_java.laba4.classes;

public class StudentArrayWrapper {
    private Student[] students;
    private int size;
    
    public StudentArrayWrapper(int capacity) {
        this.students = new Student[capacity];
        this.size = 0;
    }
    
    public void add(Student student) {
        if (this.size < students.length) {
            this.students[size++] = student;
        }
    }
    
    public Student get(int index) {
        if (index >= 0 && index < this.size) {
            return this.students[index];
        }
        throw new IndexOutOfBoundsException();
    }
    
    public int size() {
        return this.size;
    }
}
