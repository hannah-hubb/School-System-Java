public class Main {
    public static void main(String[] args) {

        Student s = new Student("Hanna", 18, "ABC School");
        GraduateStudent g = new GraduateStudent("John", 24, "XYZ University", "AI Research");
        Teacher t = new Teacher("Mr. Smith", 40, "Mathematics");

        System.out.println("---- Student ----");
        s.displayInfo();

        System.out.println("\n---- Graduate Student ----");
        g.displayInfo();

        System.out.println("\n---- Teacher ----");
        t.displayInfo();

        System.out.println("\n---- Static Method Hiding ----");
        Parent.show();
        Child.show();

        System.out.println("\n---- Final Class Demo ----");
        School school = new School();
        school.showMessage();
    }
}
