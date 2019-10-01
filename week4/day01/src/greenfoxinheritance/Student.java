package greenfoxinheritance;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    @Override
    public void introduce() {
        System.out.println("Hi I'm " + getName() + " a " + getAge() + " age old " + getGender() + " from " + this.previousOrganization + " who skipped " + skippedDays + "days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer!");
    }
}
