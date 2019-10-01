package greenfoxexercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person ("Adam" , 35, "male");
        Student student = new Student("Adam" , 35 , "male" , "Rehau" , 0);


        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Mentor> mentors = new ArrayList<>();
        ArrayList<Sponsor> sponsors = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Student john = new Student("John Doe", 20, "male", "BME", 0);
        students.add(john);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        mentors.add(gandhi);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX" ,0);
        sponsors.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (Person person2 : people) {
            person2.introduce();
            person2.getGoal();
        }

        for (Student person2 : students) {
            person2.introduce();
            person2.getGoal();
        }

        for (Mentor person2 : mentors) {
            person2.introduce();
            person2.getGoal();
        }

        for (Sponsor person2 : sponsors) {
            person2.introduce();
            person2.getGoal();
        }
    }
}
