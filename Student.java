class Student extends Person {
    protected String school;

    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("School: " + school);
    }
}
