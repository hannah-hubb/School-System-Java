package school;

public class Student extends Person {

    private int gradeLevel;

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    @Override
    void displayInfo() {
        System.out.println("Student: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Grade Level: " + gradeLevel);
    }
}
