package greenfoxexercise;

public class Person {
    String name;
    int age;
    String gender;

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi my name is " + this.name + " and I'm " + this.age + " years old, and I'm a " + this.gender);
    }

    public void getGoal() {
        System.out.println("My goal is to live for the moment");
    }

}
