package greenfoxinheritance;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        john.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(john);
        awesome.addMentor(gandhi);
        awesome.info();
    }
}
