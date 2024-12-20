//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IUStudent s1 = new IUStudent("Ivan Ivanov Ivanovich",1,4);
        s1.writeExam();
        MathStudent s2 = new MathStudent("Egor Ivanov Ivanovich",3,2);
        s2.writeExam();

        StringArray stringArray = new StringArray();
        stringArray.add("pik");
        stringArray.add("pikpik");
        stringArray.add("zzzzzzzzzz");
        System.out.println(stringArray.getMaxElement());
    }
}