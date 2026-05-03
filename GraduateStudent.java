class GraduateStudent extends Student {
    private String researchTopic;

    GraduateStudent(String name, int age, String school, String topic) {
        super(name, age, school);
        this.researchTopic = topic;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}