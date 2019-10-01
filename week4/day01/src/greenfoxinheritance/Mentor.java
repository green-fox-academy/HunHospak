package greenfoxinheritance;

public class Mentor extends Person {
    private String level;

    public Mentor (String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public void introduce() {
        System.out.println("Hi I'm " + getName() + " a " + getAge() + " age old " + getGender() + level + " mentor.");
    }

    @Override
    public void getGoal () {
        System.out.println("Educate brilliant software developers.");
    }
}
