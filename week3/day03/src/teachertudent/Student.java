package teachertudent;

public class Student {
    public void Learn () {
        System.out.println("The student is learning something new.");
    }
    public void Question () {
        Teacher question = new Teacher();
        question.Answer();
    }
}
