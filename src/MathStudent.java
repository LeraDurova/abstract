

public class MathStudent extends Student{
    MathStudent(String fullName, int course, int mark){
        super(fullName, course, mark);
    }
    @Override
    public void writeExam(){
        System.out.printf("%s , студент %d -го курса ФН пишет экзамен",fullName,course);
        System.out.print("\n");

    }
}
