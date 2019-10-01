package greenfoxexercise;

public class Mentor {
    String name;
    int age;
    String gender;
    String level;

    public Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi my name is " + this.name + " and I'm " + this.age + " years old, and I'm a " + this.gender + "at a level of " + level);
    }
}