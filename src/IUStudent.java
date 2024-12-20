public class IUStudent extends Student{
    IUStudent(String fullName, int course, int mark) {
        super(fullName, course, mark);
    }

    @Override
    public void writeExam() {
        System.out.printf("%s , студент %d -го курса ИУ пишет экзамен",fullName,course);
        System.out.print("\n");

    }
}
