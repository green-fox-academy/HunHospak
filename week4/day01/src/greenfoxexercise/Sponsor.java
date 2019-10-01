package greenfoxexercise;

public class Sponsor {
    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = hiredStudents;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi my name is " + this.name + " and I'm " + this.age + " years old, and I'm a " + this.gender + "from " + company + " who hired " + hiredStudents + " already.");
    }

    public void hire() {
        this.hiredStudents++;
    }
}