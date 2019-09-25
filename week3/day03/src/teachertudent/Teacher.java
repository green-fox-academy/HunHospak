package teachertudent;

public class Teacher {
    public void Teach() {
        Student teach = new Student();
        teach.Learn();
    }

    public void Answer() {
        System.out.println("The teacher is answering the question.");
    }
}
