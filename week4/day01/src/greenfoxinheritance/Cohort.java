package greenfoxinheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
