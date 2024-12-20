public abstract class Student {
    String fullName;
    int course;
    int mark;
    Student(String fullName, int course, int mark){
        this.fullName = fullName;
        this.course = course;
        this.mark = mark;
    }
    public abstract void writeExam();
}
