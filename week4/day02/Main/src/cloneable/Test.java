package cloneable;

import cloneable.Mentor;
import cloneable.Person;
import cloneable.Sponsor;
import cloneable.Student;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);

        john.skipDays(3);

        Student johnTheClone = john.clone();
        johnTheClone.introduce();


        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

    }
}
