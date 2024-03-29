package greenfoxinheritance;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi I'm " + getName() + " a " + getAge() + " age old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        this.hiredStudents++;
    }
}
