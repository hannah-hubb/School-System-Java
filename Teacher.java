package school;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Teacher: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
